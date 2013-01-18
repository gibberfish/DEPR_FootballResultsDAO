package uk.co.mindbadger.footballresultsanalyser.domain;

import java.util.Set;

public interface Season {
    public Integer getSeasonNumber ();
    public void setSeasonNumber (Integer seasonNumber);
    
    public Set<SeasonDivision> getDivisionsInSeason();
    public void setDivisionsInSeason(Set<SeasonDivision> divisionsInSeason);
}
