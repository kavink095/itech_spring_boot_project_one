package lk.itech.projectone.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class PersonDTO {

    private int personId;

    private String name;

    private int age;

    private int activeStatus;
}
