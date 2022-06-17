package DAL.DTO;
import jakarta.persistence.*;

@Entity
@Table(name = "Armor")
public class ArmorDTO {
    @Id
    @GeneratedValue(generator = "incrementor")
    private int id;
    private String name;
    private int dexterity;
    private int health;
    private int protection;
    private int strength;
    @OneToOne
    @JoinColumn(name = "armorType_id", referencedColumnName = "id")
    private ArmorTypeDTO armorTypeDTO;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArmorTypeDTO getArmorTypeDTO() {
        return armorTypeDTO;
    }

    public void setArmorTypeDTO(ArmorTypeDTO armorTypeDTO) {
        this.armorTypeDTO = armorTypeDTO;
    }
}




