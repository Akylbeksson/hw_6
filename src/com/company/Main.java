package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(50);
        Weapon weapon = new Weapon();
        weapon.setWeaponName();

        System.out.println("Boss' health is " + boss.getHealth() + "," +
                " his damage is " + boss.getDamage() + ". " + "And his weapon is "
                + weapon.setWeaponName()+", "
                + weapon.setWeaponType()+" type");

    }
}
