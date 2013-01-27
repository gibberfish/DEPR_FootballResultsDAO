package uk.co.mindbadger.footballresultsanalyser.domain;

public interface DomainObjectFactory {
    public Season createSeason (Integer seasonNumber);
    public Division createDivision (String divisionName);
    public Team createTeam (String teamName);
    public Fixture createFixture (Season season, Team homeTeam, Team awayTeam);
    public SeasonDivision createSeasonDivision (Season season, Division division);
    public SeasonDivisionTeam createSeasonDivisionTeam (SeasonDivision seasonDivision, Team team);
    
    public SeasonDivisionId createSeasonDivisionId (Season season, Division division);
    public SeasonDivisionTeamId createSeasonDivisionTeamId (SeasonDivision seasonDivision, Team team);
}
