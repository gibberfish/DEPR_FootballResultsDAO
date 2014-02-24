package uk.co.mindbadger.footballresultsanalyser.dao.v2;

import java.util.Calendar;
import java.util.List;

import uk.co.mindbadger.footballresultsanalyser.domain.v2.Division;
import uk.co.mindbadger.footballresultsanalyser.domain.v2.Fixture;
import uk.co.mindbadger.footballresultsanalyser.domain.v2.Season;
import uk.co.mindbadger.footballresultsanalyser.domain.v2.Team;

public interface FixtureDAO {    
    public Fixture addFixture (Season season, Calendar fixtureDate, Division division, Team homeTeam, Team awayTeam, Integer homeGoals, Integer awayGoals);
    
    public List<Fixture> getFixturesForTeamInDivisionInSeason(int seasonNumber, int divisionId, int teamId);
    
    public List<Fixture> getUnplayedFixturesBeforeToday();
    
    public List<Fixture> getFixturesWithNoFixtureDate ();    
}
