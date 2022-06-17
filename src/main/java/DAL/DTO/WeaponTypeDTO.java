package DAL.DTO;

import Logic.Entities.Weapon.Weapon;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "weaponType")
public class WeaponTypeDTO {

    @Id
    @GeneratedValue(generator = "incrementor")
    private int id;

    private String name;

    @OneToMany
    @JoinColumn(name = "weaponType_id", referencedColumnName = "id")
    private List<WeaponDTO> weaponList;

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

    public List<WeaponDTO> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<WeaponDTO> weaponList) {
        this.weaponList = weaponList;
    }
}
