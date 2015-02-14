package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface SeasonDivisionTeam<K> extends Serializable {
    public SeasonDivisionTeamId<K> getPrimaryKey();
    public void setPrimaryKey(SeasonDivisionTeamId<K> primaryKey);
    
    public SeasonDivision<K> getSeasonDivision();
    public void setSeasonDivision(SeasonDivision<K> seasonDivision);
    
    public Team<K> getTeam();
    public void setTeam(Team<K> team);
}
