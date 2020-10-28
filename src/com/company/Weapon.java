package com.company;

public class Weapon {
    private String Type;
    private String Name;

    public String getWeaponType() {
        return Type;
    }

    public void setWeaponType(String weaponType) {
        this.Type = weaponType;
    }

    public String getWeaponName() {
        return Name;
    }

    public void setWeaponName(String weaponName) {
        this.Name = weaponName;
    }

    public Weapon(String name,String Type){
        this.setWeaponType(Type);
        this.setWeaponName(name);

    }
}
