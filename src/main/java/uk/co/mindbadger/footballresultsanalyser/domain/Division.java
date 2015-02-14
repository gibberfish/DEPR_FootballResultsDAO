package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;
import java.util.Set;

public interface Division<K> extends Serializable {
    public K getDivisionId();
    public void setDivisionId(K divisionId);
    public String getDivisionIdAsString();
    
    public String getDivisionName();
    public void setDivisionName(String divisionName);
    
    public Set<SeasonDivision<K>> getSeasonsForDivision();
    public void setSeasonsForDivision(Set<SeasonDivision<K>> seasonsForDivision);
}
