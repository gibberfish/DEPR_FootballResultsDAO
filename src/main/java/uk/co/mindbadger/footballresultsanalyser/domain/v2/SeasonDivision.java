package uk.co.mindbadger.footballresultsanalyser.domain.v2;

import java.io.Serializable;

public interface SeasonDivision extends Serializable {
    public Integer getSeasonNumber ();
    public void setSeasonNumber (Integer seasonNumber);    
 
    public Integer getDivisionId();
    public void setDivisionId(Integer divisionId);
    
    public int getDivisionPosition();
    public void setDivisionPosition(int divisionPosition);    
}
