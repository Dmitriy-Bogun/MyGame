package Logic.Entities.Impl;

public class Traider {
    public IWeapon getWeapon(Weapons type){
        switch (type){
            case SWORD:
                return new Sword();
            case KNIFE:
                return new Knife();

        }
        return null;
    }
    public IArmor getArmor(Armor type){
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
