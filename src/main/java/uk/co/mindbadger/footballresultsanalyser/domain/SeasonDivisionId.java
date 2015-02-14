package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface SeasonDivisionId<K> extends Serializable {
    public Season<K> getSeason();
    public void setSeason(Season<K> season);
    
    public Division<K> getDivision();
    public void setDivision(Division<K> division);
}
