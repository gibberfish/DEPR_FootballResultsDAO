package uk.co.mindbadger.footballresultsanalyser.domain.v2;

import java.io.Serializable;

public interface Division extends Serializable {
    public Integer getDivisionId();
    public void setDivisionId(Integer divisionId);
    
    public String getDivisionName();
    public void setDivisionName(String divisionName);    
}
