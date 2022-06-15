package DAL.DTO;

import Logic.Entities.Weapon.WeaponType;
import jakarta.persistence.*;

@Entity
@Table(name = "name = weapon")
public class WeaponDTO {
    @Id
    @GeneratedValue(generator = "incrementor")
    @Column(name = "id")
    private int damage;
    private int dexterity;
    private int cost;
    private String name;
    @Column(name = "weapon_type")
    private WeaponType weaponType;

    public WeaponDTO(int damage, int dexterity, int cost, String name, WeaponType weaponType) {
        this.damage = damage;
        this.dexterity = dexterity;
        this.cost = cost;
        this.name = name;
        this.weaponType = weaponType;
    }
    public WeaponDTO(){

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
