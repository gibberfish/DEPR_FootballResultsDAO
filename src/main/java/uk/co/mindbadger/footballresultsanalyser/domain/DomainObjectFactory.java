package uk.co.mindbadger.footballresultsanalyser.domain;

public interface DomainObjectFactory<K> {
    public Season<K> createSeason (Integer seasonNumber);
    public Division<K> createDivision (String divisionName);
    public Team<K> createTeam (String teamName);
    public Fixture<K> createFixture (Season<K> season, Team<K> homeTeam, Team<K> awayTeam);
    public SeasonDivision<K> createSeasonDivision (Season<K> season, Division<K> division);
    public SeasonDivisionTeam<K> createSeasonDivisionTeam (SeasonDivision<K> seasonDivision, Team<K> team);
    
    public SeasonDivisionId<K> createSeasonDivisionId (Season<K> season, Division<K> division);
    public SeasonDivisionTeamId<K> createSeasonDivisionTeamId (SeasonDivision<K> seasonDivision, Team<K> team);
}
