package DAL.DTO;
import jakarta.persistence.*;

@Entity
@Table(name = "name = armorType")

public class ArmorTypeDTO {

    @Id
    @GeneratedValue(generator = "incrementor")
    @Column(name = "id")
    private int Id;
    @Column(name = "name")
    private String Name;
    
    public ArmorTypeDTO() {

    }

    public ArmorTypeDTO(int id, String name) {
        Id = id;
        Name = name;
    }
    
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    

}
