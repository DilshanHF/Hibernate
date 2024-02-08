package lk.ijse.entity;

import jakarta.persistence.*;
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
    @OneToMany(mappedBy = "student")
    private List<Laptop> laptop;


}
