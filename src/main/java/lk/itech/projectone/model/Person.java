package lk.itech.projectone.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;

    @Column(name = "name")
    private String name;

    @Column(name = "age", length = 3)
    private int age;

    @Column(name = "active_status", length = 1)
    private int activeStatus;

}
