package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class Student {
   @Id
    private int id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "student",fetch = FetchType.EAGER)
    private List<Laptop> laptop;


}
