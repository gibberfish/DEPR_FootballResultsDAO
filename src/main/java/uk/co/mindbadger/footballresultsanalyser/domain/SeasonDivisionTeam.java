package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface SeasonDivisionTeam extends Serializable {
    public String getId();
    public void setId(String id);
    
    public SeasonDivision getSeasonDivision();
    public void setSeasonDivision(SeasonDivision seasonDivision);
    
    public Team getTeam();
    public void setTeam(Team team);
}
