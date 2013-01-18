package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface SeasonDivisionId extends Serializable {
    public Season getSeason();
    public void setSeason(Season season);
    
    public Division getDivision();
    public void setDivision(Division division);
}
