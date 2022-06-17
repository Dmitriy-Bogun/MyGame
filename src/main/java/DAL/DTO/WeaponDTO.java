package DAL.DTO;

import Logic.Entities.Weapon.WeaponType;
import jakarta.persistence.*;

@Entity
@Table(name = "weapon")
public class WeaponDTO {
    @Id
    @GeneratedValue(generator = "incrementor")
    @Column(name = "id")
    private int damage;
    private int dexterity;
    private int cost;
    private String name;
    @OneToOne
    @JoinColumn(name = "weaponType_id", referencedColumnName = "id")
    private WeaponTypeDTO weaponType;


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


    public int getDamage() {
        return damage;
    }

    public WeaponTypeDTO getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponTypeDTO weaponType) {
        this.weaponType = weaponType;
    }
}
