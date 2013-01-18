package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface SeasonDivisionTeam extends Serializable {
    public SeasonDivisionTeamId getPrimaryKey();
    public void setPrimaryKey(SeasonDivisionTeamId primaryKey);
    
    public SeasonDivision getSeasonDivision();
    public void setSeasonDivision(SeasonDivision seasonDivision);
    
    public Team getTeam();
    public void setTeam(Team team);
}
