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

public interface FootballResultsAnalyserDAO<K> {
	// Season
    public List<Season<K>> getSeasons ();
    public Season<K> getSeason (Integer seasonNum);
    public Season<K> addSeason (Integer seasonNum);
    
    // Division
    public Map<K, Division<K>> getAllDivisions ();
    public Division<K> addDivision (String divisionName);
    public Division<String> getDivision(K divId);
    
    // Teams
    public Map<K, Team<K>> getAllTeams ();
    public Team<K> addTeam (String teamName);
    public Team<String> getTeam(K teamId);
    
    // Fixture
    public Fixture<K> addFixture (Season<K> season, Calendar fixtureDate, Division<K> division, Team<K> homeTeam, Team<K> awayTeam, Integer homeGoals, Integer awayGoals);
    public List<Fixture<K>> getFixturesForTeamInDivisionInSeason(Season<K> season, Division<K> division, Team<K> team);
    public List<Fixture<K>> getUnplayedFixturesBeforeToday();
    public List<Fixture<K>> getFixturesWithNoFixtureDate ();

    // Season Shape
    //public Set<SeasonDivision<K>> getDivisionsForSeason (int seasonNumber);
    //public Set<SeasonDivisionTeam<K>> getTeamsForDivisionInSeason(int seasonNumber, int divisionId);

    // Housekeeping
    public void startSession ();
    public void closeSession ();
}
