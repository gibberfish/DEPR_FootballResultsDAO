package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface SeasonDivision<K, L> extends Serializable {
    public L getId();
    public void setId(L id);
    
    public Season<K> getSeason();
    public void setSeason(Season<K> season);
    
    public Division<K> getDivision();
    public void setDivision(Division<K> division);
    
    public int getDivisionPosition();
    public void setDivisionPosition(int divisionPosition);    
}
