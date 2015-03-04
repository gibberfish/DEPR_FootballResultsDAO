package uk.co.mindbadger.footballresultsanalyser.domain;

public interface DomainObjectFactory<K, L, M> {
    public Season<K> createSeason (Integer seasonNumber);
    public Division<K> createDivision (String divisionName);
    public Team<K> createTeam (String teamName);
    public Fixture<K> createFixture (Season<K> season, Team<K> homeTeam, Team<K> awayTeam);
    public SeasonDivision<K, L> createSeasonDivision (Season<K> season, Division<K> division, int position);
    public SeasonDivisionTeam<K, L, M> createSeasonDivisionTeam (SeasonDivision<K, L> seasonDivision, Team<K> team);
    
    public L createSeasonDivisionId (Season<K> season, Division<K> division);
    public M createSeasonDivisionTeamId (SeasonDivision<K, L> seasonDivision, Team<K> team);
}
