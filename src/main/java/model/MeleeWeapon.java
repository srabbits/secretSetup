package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeleeWeapon {
    @Id
    Long id;
    @NotNull
    String name;
    @NotNull
    Integer damage;
    @NotNull
    Boolean isTwoHanded;



}
