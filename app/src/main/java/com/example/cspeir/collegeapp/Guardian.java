package com.example.cspeir.collegeapp;

/**
 * Created by cspeir on 10/6/2017.
 */

public class Guardian extends FamilyMember {
    private String occupation;
    public Guardian(String first, String last){
        super(first, last);
        occupation= "unknown";
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}

