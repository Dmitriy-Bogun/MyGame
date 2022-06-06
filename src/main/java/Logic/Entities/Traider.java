package Logic.Entities;

import Logic.Entities.Armor.*;
import Logic.Entities.Weapon.*;

public class Traider {
    public IWeapon getWeapon(WeaponType type){
        switch (type){
            case SWORD:
                return new Sword();
            case KNIFE:
                return new Knife();
        }
        return null;
    }
    public IArmor getArmor(ArmorType type){
        switch (type){
            case HARDARMOR:
                return new HardArmor();
            case MEDIUMARMOR:
                return new MediumArmor();
            case LITEARMOR:
                return new LiteArmor();
        }
        return null;
    }

}
