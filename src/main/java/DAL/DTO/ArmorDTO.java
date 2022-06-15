package DAL.DTO;
import jakarta.persistence.*;

@Entity
@Table(name = "name = armor")

public class ArmorDTO {
    @Id
    @GeneratedValue(generator = "incrementor")
    @Column(name = "id")
    private int ID;
    @Column(name = "name")
    private  String name;
    @Column(name = "dexterity")
    private int dexterity;
    @Column(name = "health")
    private int health;
    @Column(name = "protection")
    private int protection;
    @Column(name = "strength")
    private int strength;
    @Column(name = "armorType")
    @OneToMany
    private ArmorTypeDTO armorType;

    

    public ArmorDTO(int iD, String name, int dexterity, int health, int protection, int strength,
            ArmorTypeDTO armorType) {
        ID = iD;
        this.name = name;
        this.dexterity = dexterity;
        this.health = health;
        this.protection = protection;
        this.strength = strength;
        this.armorType = armorType;
    }



    public ArmorDTO() {
    }



    public int getID() {
        return ID;
    }



    public void setID(int iD) {
        ID = iD;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getDexterity() {
        return dexterity;
    }



    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }



    public int getHealth() {
        return health;
    }



    public void setHealth(int health) {
        this.health = health;
    }



    public int getProtection() {
        return protection;
    }



    public void setProtection(int protection) {
        this.protection = protection;
    }



    public int getStrength() {
        return strength;
    }



    public void setStrength(int strength) {
        this.strength = strength;
    }



    public ArmorTypeDTO getArmorType() {
        return armorType;
    }



    public void setArmorType(ArmorTypeDTO armorType) {
        this.armorType = armorType;
    }
}
