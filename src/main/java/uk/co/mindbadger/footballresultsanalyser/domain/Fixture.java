package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;
import java.util.Calendar;

public interface Fixture extends Serializable {
    public Integer getFixtureId();
    public void setFixtureId(Integer fixtureId);
    
    public Season getSeason();
    public void setSeason(Season season);
    
    public Team getHomeTeam();
    public void setHomeTeam(Team homeTeam);
    
    public Team getAwayTeam();
    public void setAwayTeam(Team awayTeam);
    
    public Calendar getFixtureDate();
    public void setFixtureDate(Calendar fixtureDate);
    
    public Division getDivision();
    public void setDivision(Division division);
    
    public Integer getHomeGoals();
    public void setHomeGoals(Integer homeGoals);
    
    public Integer getAwayGoals();
    public void setAwayGoals(Integer awayGoals);
}
