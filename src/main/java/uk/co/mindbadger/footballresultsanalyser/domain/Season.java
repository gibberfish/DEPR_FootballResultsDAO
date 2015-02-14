package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;
import java.util.Set;

public interface Season<K> extends Serializable {
    public Integer getSeasonNumber ();
    public void setSeasonNumber (Integer seasonNumber);
    
    public Set<SeasonDivision<K>> getDivisionsInSeason();
    public void setDivisionsInSeason(Set<SeasonDivision<K>> divisionsInSeason);
}
