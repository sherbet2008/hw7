package com.company;

public class Warrior extends  Hero implements  HavingSuperAbility {






    public Warrior(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);


    }




    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(" Health "+getHealth()+" Damage "+getDamage()+" Супер умения "+getSuperAbilityType()+" физиическое Умения ");
    }
}
