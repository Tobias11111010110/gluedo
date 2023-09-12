package com.bbw.tkl.zkb;

public class Weapon {

    public  String name;
public String Reichweite;
public String Munitionstyp;
public String material;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReichweite() {
        return Reichweite;
    }

    public void setReichweite(String reichweite) {
        Reichweite = reichweite;
    }

    public String getMunitionstyp() {
        return Munitionstyp;
    }

    public void setMunitionstyp(String munitionstyp) {
        Munitionstyp = munitionstyp;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Weapon(String name, String reichweite, String munitionstyp, String material) {
        this.name = name;
        Reichweite = reichweite;
        Munitionstyp = munitionstyp;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", Reichweite='" + Reichweite + '\'' +
                ", Munitionstyp='" + Munitionstyp + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
