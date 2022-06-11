package Logic.Entities.Armor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "name = lite_armor")

public class LiteArmor implements IArmor {
    @Id
    @GeneratedValue(generator = "incrementor")
    private int ID;
    private  String name;
    private int dexterity;
    private int health;
    private int protection;
    private int strength;
    @Override
    public int getProtection() {
        return protection;
    }

    @Override
    public int getDexterity() {
        return dexterity;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public String getName() {
        return name;
    }
}
