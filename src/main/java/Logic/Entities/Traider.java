package Logic.Entities;

import DAL.Repository.ArmorRepository;
import Logic.Entities.Armor.*;
import Logic.Entities.Weapon.*;

import java.util.List;

public class Traider {
    ArmorRepository armorRepository;

    public Traider(){
        this.armorRepository = new ArmorRepository();
    }

    public IWeapon getWeapon(WeaponType type){
        //TODO: Add work with Weapon repository here
        // switch (type){
        //     case SWORD:
        //         return new Weapon();
        //     case KNIFE:
        //         return new Weapon();

        // }
        // return null;

        return new Weapon(5, 1, 2, "default", WeaponType.KNIFE);
    }
    public List<Armor> getArmor(ArmorType type){
        //TODO: Add work with Armor repository here
         switch (type){
             case HARDARMOR:
                 return armorRepository.requestHardArmor();
             case MEDIUMARMOR:
                 return armorRepository.requestMediumArmor();
             case LITEARMOR:
                 return armorRepository.requestLiteArmor();
         }
        return null;
    }

}
