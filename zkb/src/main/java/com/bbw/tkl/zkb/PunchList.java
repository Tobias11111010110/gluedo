package com.bbw.tkl.zkb;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PunchList {

    public int room;
    public int person;
    public int weapon;

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public PunchList(int room, int person, int weapon) {
        this.room = room;
        this.person = person;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "PunchList{" +
                "room=" + room +
                ", person=" + person +
                ", weapon=" + weapon +
                '}';
    }
}

