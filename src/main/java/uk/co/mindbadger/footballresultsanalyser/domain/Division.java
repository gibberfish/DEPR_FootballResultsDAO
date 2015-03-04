package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface Division<K> extends Serializable {
    public K getDivisionId();
    public void setDivisionId(K divisionId);
    public String getDivisionIdAsString();
    
    public String getDivisionName();
    public void setDivisionName(String divisionName);    
}
