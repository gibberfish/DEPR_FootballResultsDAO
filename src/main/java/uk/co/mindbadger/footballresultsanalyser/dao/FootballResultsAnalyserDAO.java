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

public interface FootballResultsAnalyserDAO<K, L, M> {
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
    public Fixture<K> getFixture (Season<K> season, Division<K> division, Team<K> homeTeam, Team<K> awayTeam);
    public Fixture<K> addFixture (Season<K> season, Calendar fixtureDate, Division<K> division, Team<K> homeTeam, Team<K> awayTeam, Integer homeGoals, Integer awayGoals);
    public List<Fixture<K>> getFixturesForTeamInDivisionInSeason(Season<K> season, Division<K> division, Team<K> team);
    public List<Fixture<K>> getUnplayedFixturesBeforeToday();
    public List<Fixture<K>> getFixturesWithNoFixtureDate ();
    public List<Fixture<K>> getFixtures ();

    // Season Shape
    public SeasonDivision<K, L> getSeasonDivision (Season<K> season, Division<K> division);
    public SeasonDivision<K, L> addSeasonDivision (Season<K> season, Division<K> division, int position);
    public SeasonDivision<K, L> getSeasonDivision (L seasonDivisionId);
    public SeasonDivisionTeam<K, L, M> addSeasonDivisionTeam (SeasonDivision<K, L> seasonDivision, Team<K> team);
    public Set<SeasonDivision<K,L>> getDivisionsForSeason (Season<K> season);
    public Set<SeasonDivisionTeam<K,L,M>> getTeamsForDivisionInSeason(SeasonDivision<K,L> seasonDivision);

    // Housekeeping
    public void startSession ();
    public void closeSession ();
}
