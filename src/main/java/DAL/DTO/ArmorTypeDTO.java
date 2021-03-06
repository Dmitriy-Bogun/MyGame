package DAL.DTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "armorType")

public class ArmorTypeDTO {

    @Id
    @GeneratedValue(generator = "incrementor")
    private int id;
    private String name;
@OneToMany
@JoinColumn(name = "armorType_id", referencedColumnName = "id")
    private List<ArmorDTO> armorList;
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

    public List<ArmorDTO> getArmorList() {
        return armorList;
    }

    public void setArmorList(List<ArmorDTO> armorList) {
        this.armorList = armorList;
    }
}
