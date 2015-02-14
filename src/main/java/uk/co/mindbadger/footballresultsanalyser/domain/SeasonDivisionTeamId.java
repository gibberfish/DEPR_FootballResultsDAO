package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface SeasonDivisionTeamId<K> extends Serializable {
    public SeasonDivision<K> getSeasonDivision();
    public void setSeasonDivision(SeasonDivision<K> seasonDivision);
    
    public Team<K> getTeam();
    public void setTeam(Team<K> team);
}
