package DAL.Repository;

import DAL.DTO.ArmorDTO;
import DAL.DTO.ArmorTypeDTO;
import Logic.Entities.Armor.ArmorType;
import Logic.Entities.Armor.IArmor;
import Logic.Entities.Traider;
import Logic.Entities.Armor.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;
import java.util.Random;

public class ArmorRepository {


    private List<ArmorDTO> resultList;
    private List<Armor> returnList;

    public List<Armor> requestLiteArmor() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager requestManager = entityManagerFactory.createEntityManager();

        requestManager.getTransaction().begin();
        resultList = requestManager.createQuery("SELECT c FROM Armor c WHERE protection < 20").getResultList();
        requestManager.close();
        List<ArmorDTO> list = resultList;
        for (ArmorDTO armorDTO : list) {
            returnList.add(new Armor(armorDTO.getName(),
                    armorDTO.getDexterity(),
                    armorDTO.getHealth(),
                    armorDTO.getProtection(),
                    armorDTO.getStrength(),
                    ArmorType.LITEARMOR));
        }
        return returnList;
    }

    public List<Armor> requestMediumArmor() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager requestManager = entityManagerFactory.createEntityManager();
        requestManager.getTransaction().begin();
        resultList = requestManager.createQuery("SELECT c FROM public.armor c WHERE protection > 20 AND protection < 30").getResultList();
        requestManager.close();
        List<ArmorDTO> list = resultList;
        for (ArmorDTO armorDTO : list) {
            returnList.add(new Armor(armorDTO.getName(),
                    armorDTO.getDexterity(),
                    armorDTO.getHealth(),
                    armorDTO.getProtection(),
                    armorDTO.getStrength(),
                    ArmorType.MEDIUMARMOR));
        }
        return returnList;
    }
    public List<Armor> requestHardArmor() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager requestManager = entityManagerFactory.createEntityManager();

        requestManager.getTransaction().begin();
        resultList = requestManager.createQuery("SELECT c FROM Armor c WHERE protection > 30 ").getResultList();
        requestManager.close();
        List<ArmorDTO> list = resultList;
        for (ArmorDTO armorDTO : list) {
            returnList.add(new Armor(armorDTO.getName(),
                    armorDTO.getDexterity(),
                    armorDTO.getHealth(),
                    armorDTO.getProtection(),
                    armorDTO.getStrength(),
                    ArmorType.LITEARMOR));
        }
        return returnList;
    }
}
