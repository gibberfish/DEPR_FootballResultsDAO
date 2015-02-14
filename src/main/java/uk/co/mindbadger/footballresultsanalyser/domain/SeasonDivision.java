package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;
import java.util.Set;

public interface SeasonDivision<K> extends Serializable {
    public SeasonDivisionId<K> getPrimaryKey();
    public void setPrimaryKey(SeasonDivisionId<K> primaryKey);
    
    public Season<K> getSeason();
    public void setSeason(Season<K> season);
    
    public Division<K> getDivision();
    public void setDivision(Division<K> division);
    
    public int getDivisionPosition();
    public void setDivisionPosition(int divisionPosition);
    
    public Set<SeasonDivisionTeam<K>> getTeamsInSeasonDivision();
    public void setTeamsInSeasonDivision(Set<SeasonDivisionTeam<K>> teamsInSeasonDivision);
}
