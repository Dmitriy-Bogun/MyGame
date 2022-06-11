package Logic.Entities;

import Logic.Entities.Armor.*;
import Logic.Entities.Weapon.*;

public class Traider {
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
    public IArmor getArmor(ArmorType type){
        //TODO: Add work with Armor repository here
        // switch (type){
        //     case HARDARMOR:
        //         return new Armor();
        //     case MEDIUMARMOR:
        //         return new Armor();
        //     case LITEARMOR:
        //         return new Armor();
        // }
        return new Armor("default", 1, 1, 1, 1, ArmorType.LITEARMOR);
    }

}
