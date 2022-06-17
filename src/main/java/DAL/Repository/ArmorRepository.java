package DAL.Repository;

import DAL.DTO.ArmorDTO;
import DAL.DTO.ArmorTypeDTO;
import Logic.Entities.Armor.ArmorType;
import Logic.Entities.Armor.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class ArmorRepository {

    public List<Armor> requestArmor(ArmorType armorType) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager requestManager = entityManagerFactory.createEntityManager();

        requestManager.getTransaction().begin();
        List<ArmorTypeDTO> resultList = requestManager.createQuery("SELECT c FROM ArmorTypeDTO c WHERE c.name = '" + armorType.name() + "'").getResultList();
        requestManager.getTransaction().commit();
        requestManager.close();
        List<Armor> returnList = new ArrayList<>();
        for (ArmorDTO armorDTO : resultList.get(0).getArmorList()) {

            returnList.add(new Armor(armorDTO.getName(),
                    armorDTO.getDexterity(),
                    armorDTO.getHealth(),
                    armorDTO.getProtection(),
                    armorDTO.getStrength(),
                    armorType));
        }
        return returnList;
    }
}
