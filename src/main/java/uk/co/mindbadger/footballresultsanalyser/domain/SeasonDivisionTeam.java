package uk.co.mindbadger.footballresultsanalyser.domain;

public interface SeasonDivisionTeam {
    public SeasonDivisionTeamId getPrimaryKey();
    public void setPrimaryKey(SeasonDivisionTeamId primaryKey);
    
    public SeasonDivision getSeasonDivision();
    public void setSeasonDivision(SeasonDivision seasonDivision);
    
    public Team getTeam();
    public void setTeam(Team team);
}
