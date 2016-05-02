package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface SeasonDivision extends Serializable, Comparable<SeasonDivision> {
    public String getId();
    public void setId(String id);
    
    public Season getSeason();
    public void setSeason(Season season);
    
    public Division getDivision();
    public void setDivision(Division division);
    
    public int getDivisionPosition();
    public void setDivisionPosition(int divisionPosition);    
}
