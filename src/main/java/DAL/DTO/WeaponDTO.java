package DALServicesDTO.WeaponDTO;

import Logic.Entities.Weapon.WeaponType;

public class WeaponDTO {
    private int damage;
    private int dexterity;
    private int cost;
    private String name;
    private WeaponType weaponType;

    public WeaponDTO(int damage, int dexterity, int cost, String name, WeaponType weaponType) {
        this.damage = damage;
        this.dexterity = dexterity;
        this.cost = cost;
        this.name = name;
        this.weaponType = weaponType;
    }


    public int getDamageValue() {
        return damage;
    }


    public int getCost() {
        return cost;
    }


    public String getName() {
        return name;
    }

    public int getDexterity() {
        return dexterity;
    }


    public WeaponType getWeaponType() {
        return weaponType;
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }


    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }


    public void setCost(int cost) {
        this.cost = cost;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
