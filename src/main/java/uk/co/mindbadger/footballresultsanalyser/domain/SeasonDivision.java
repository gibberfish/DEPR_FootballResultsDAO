package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;
import java.util.Set;

public interface SeasonDivision extends Serializable {
    public SeasonDivisionId getPrimaryKey();
    public void setPrimaryKey(SeasonDivisionId primaryKey);
    
    public Season getSeason();
    public void setSeason(Season season);
    
    public Division getDivision();
    public void setDivision(Division division);
    
    public int getDivisionPosition();
    public void setDivisionPosition(int divisionPosition);
    
    public Set<SeasonDivisionTeam> getTeamsInSeasonDivision();
    public void setTeamsInSeasonDivision(Set<SeasonDivisionTeam> teamsInSeasonDivision);
}
