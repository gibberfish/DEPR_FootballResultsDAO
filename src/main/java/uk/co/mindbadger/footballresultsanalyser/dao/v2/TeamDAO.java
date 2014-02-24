package uk.co.mindbadger.footballresultsanalyser.dao.v2;

import java.util.Map;
import java.util.Set;

import uk.co.mindbadger.footballresultsanalyser.domain.v2.SeasonDivisionTeam;
import uk.co.mindbadger.footballresultsanalyser.domain.v2.Team;

public interface TeamDAO {
    public Map<Integer, Team> getAllTeams ();
    
    public Team addTeam (String teamName);
    
    public Set<SeasonDivisionTeam> getTeamsForDivisionInSeason(int seasonNumber, int divisionId);
}
