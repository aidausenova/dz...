package com.company;


public class Main {

    public static void main(String[] args) {
        Weapon M416 = new Weapon("M416","Assault Rifle");
        Boss Thanos = new Boss();
        Thanos.setHealth(700);
        Thanos.setDamage(50);
        Thanos.setM416(M416);
        System.out.println("Boss damage: "+ Thanos.getDamage()+"\nBoss Health: " + Thanos.getHealth()+ "\nThe Weapon of Boss: "+ Thanos.getM416().getWeaponName()+ "\nType : "+ Thanos.getM416().getWeaponType());
    }
}
