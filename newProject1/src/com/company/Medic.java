package com.company;

public class Medic extends  Hero implements HavingSuperAbility {



    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(" Health "+getHealth()+" Damage "+getDamage()+" Супер умения "+getSuperAbilityType());
    }
}
