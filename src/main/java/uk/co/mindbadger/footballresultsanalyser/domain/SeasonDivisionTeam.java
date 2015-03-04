package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface SeasonDivisionTeam<K, L, M> extends Serializable {
    public L getId();
    public void setId(L id);
    
    public SeasonDivision<K, M> getSeasonDivision();
    public void setSeasonDivision(SeasonDivision<K, M> seasonDivision);
    
    public Team<K> getTeam();
    public void setTeam(Team<K> team);
}
