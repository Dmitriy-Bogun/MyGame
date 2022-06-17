package DAL.Repository;

import DAL.DTO.WeaponDTO;
import DAL.DTO.WeaponTypeDTO;
import Logic.Entities.Weapon.Weapon;
import Logic.Entities.Weapon.WeaponType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class WeaponRepository {
    public List<Weapon> requestWeapon(WeaponType weaponType) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager requestManager = entityManagerFactory.createEntityManager();

        requestManager.getTransaction().begin();
        List<WeaponTypeDTO> resultList = requestManager.createQuery("SELECT c FROM WeaponTypeDTO c WHERE c.name = '" + weaponType.name() + "'").getResultList();
        requestManager.getTransaction().commit();
        requestManager.close();
        List<Weapon> returnList = new ArrayList<>();
        for (WeaponDTO weaponDTO : resultList.get(0).getWeaponList()) {

            returnList.add(new Weapon(weaponDTO.getDamage(), weaponDTO.getDexterity(),weaponDTO.getCost(),weaponDTO.getName(),weaponType));
        }
        return returnList;
    }
}
