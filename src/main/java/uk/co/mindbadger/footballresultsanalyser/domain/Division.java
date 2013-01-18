package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;
import java.util.Set;

public interface Division extends Serializable {
    public Integer getDivisionId();
    public void setDivisionId(Integer divisionId);
    
    public String getDivisionName();
    public void setDivisionName(String divisionName);
    
    public Set<SeasonDivision> getSeasonsForDivision();
    public void setSeasonsForDivision(Set<SeasonDivision> seasonsForDivision);
}
