package DALServicesDTO.ArmorDTO;

import jakarta.persistence.*;

@Entity
@Table(name = "name = armor")

public class ArmorDTO {
    @Id
    @GeneratedValue(generator = "incrementor")
    @Column(name = "id")
    private int ID;
    private  String name;
    private int dexterity;
    private int health;
    private int protection;
    private int strength;

    private

    public ArmorDTO(int ID, String name, int dexterity, int health, int protection, int strength) {
        this.ID = ID;
        this.name = name;
        this.dexterity = dexterity;
        this.health = health;
        this.protection = protection;
        this.strength = strength;
    }

    public ArmorDTO() {
    }
}
