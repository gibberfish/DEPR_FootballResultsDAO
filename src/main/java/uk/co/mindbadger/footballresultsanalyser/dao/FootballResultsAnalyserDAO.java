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
    public List<Season<K>> getSeasons ();
    public Season<K> getSeason (Integer seasonNum);
    public Season<K> addSeason (Integer seasonNum);
    
    public Map<K, Division<K>> getAllDivisions ();
    public Division<K> addDivision (String divisionName);
    
    public Map<K, Team<K>> getAllTeams ();
    public Team<K> addTeam (String teamName);
    
    public Fixture<K> addFixture (Season<K> season, Calendar fixtureDate, Division<K> division, Team<K> homeTeam, Team<K> awayTeam, Integer homeGoals, Integer awayGoals);
    
    public Set<SeasonDivision<K>> getDivisionsForSeason (int seasonNumber);

    public Set<SeasonDivisionTeam<K>> getTeamsForDivisionInSeason(int seasonNumber, int divisionId);

    public List<Fixture<K>> getFixturesForTeamInDivisionInSeason(int seasonNumber, int divisionId, int teamId);
    
    public List<Fixture<K>> getUnplayedFixturesBeforeToday();
    
    public List<Fixture<K>> getFixturesWithNoFixtureDate ();
    
    public void startSession ();
    public void closeSession ();
}
