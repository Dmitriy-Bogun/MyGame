package DAL.Repository;

import DAL.DTO.ArmorDTO;
import DAL.DTO.ArmorTypeDTO;
import Logic.Entities.Armor.ArmorType;
import Logic.Entities.Armor.IArmor;
import Logic.Entities.Traider;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;
import java.util.Random;

public class ArmorRepository {

    private ArmorDTO armorDTO;
    private ArmorTypeDTO armorTypeDTO;
    ArmorType armorType;
    Random random;
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager requestManager = entityManagerFactory.createEntityManager();

    public ArmorDTO requestArmor(){
     requestManager.getTransaction().begin();
        Query queryJoinTable = requestManager.createQuery("");
        if (armorType == ArmorType.LITEARMOR){
        Query queryLiteArmor = requestManager.createQuery("");
            {
                if (armorType == ArmorType.MEDIUMARMOR) {
                    Query queryMediumArmor = requestManager.createQuery("");
                    {
                        if (armorType == ArmorType.HARDARMOR) {
                            Query queryHardArmor = requestManager.createQuery("");
                        }
                    }
                }
            }
    }
        Query queryId = requestManager.createQuery("SELECT id");
        return armorDTO;
    }
}
