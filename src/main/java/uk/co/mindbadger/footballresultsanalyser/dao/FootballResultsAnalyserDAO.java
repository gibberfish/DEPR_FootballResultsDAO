package uk.co.mindbadger.footballresultsanalyser.dao;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;

import uk.co.mindbadger.footballresultsanalyser.domain.Division;
import uk.co.mindbadger.footballresultsanalyser.domain.Fixture;
import uk.co.mindbadger.footballresultsanalyser.domain.Season;
import uk.co.mindbadger.footballresultsanalyser.domain.SeasonDivision;
import uk.co.mindbadger.footballresultsanalyser.domain.SeasonDivisionTeam;
import uk.co.mindbadger.footballresultsanalyser.domain.Team;

public interface FootballResultsAnalyserDAO {
    public List<Season> getSeasons ();
    public Season getSeason (Integer seasonNum);
    public Season addSeason (Integer seasonNum);
    
    public Map<Integer, Division> getAllDivisions ();
    public Division addDivision (String divisionName);
    
    public Map<Integer, Team> getAllTeams ();
    public Team addTeam (String teamName);
    
    public Fixture addFixture (Season season, Calendar fixtureDate, Division division, Team homeTeam, Team awayTeam, Integer homeGoals, Integer awayGoals);
    
    public Set<SeasonDivision> getDivisionsForSeason (int seasonNumber);

    public Set<SeasonDivisionTeam> getTeamsForDivisionInSeason(int seasonNumber, int divisionId);

    public List<Fixture> getFixturesForTeamInDivisionInSeason(int seasonNumber, int divisionId, int teamId);
    
    public List<Fixture> getUnplayedFixturesBeforeToday();
    
    public void startSession ();
    public void closeSession ();
}
