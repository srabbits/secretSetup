package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Zombie {
    @Id
    Long id;

    @NotNull
    String name;
    @NotNull
    Integer health;
    @NotNull
    Boolean hasLeftArm;
    @NotNull
    Boolean hasRightArm;
    @NotNull
    Boolean hasLeftLeg;
    @NotNull
    Boolean hasRightLeg;
    @NotNull
    Boolean hasHead;
    @NotNull
    Integer tier;
    @NotNull
    Integer defense;

    MeleeWeapon meleeWeapon;
    RangedWeapon rangedWeapon;
    Armor armor;



}
