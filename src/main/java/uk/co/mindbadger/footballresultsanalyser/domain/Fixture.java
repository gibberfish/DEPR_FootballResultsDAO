package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;
import java.util.Calendar;

public interface Fixture<K> extends Serializable {
    public K getFixtureId();
    public void setFixtureId(K fixtureId);
    
    public Season<K> getSeason();
    public void setSeason(Season<K> season);
    
    public Team<K> getHomeTeam();
    public void setHomeTeam(Team<K> homeTeam);
    
    public Team<K> getAwayTeam();
    public void setAwayTeam(Team<K> awayTeam);
    
    public Calendar getFixtureDate();
    public void setFixtureDate(Calendar fixtureDate);
    
    public Division<K> getDivision();
    public void setDivision(Division<K> division);
    
    public Integer getHomeGoals();
    public void setHomeGoals(Integer homeGoals);
    
    public Integer getAwayGoals();
    public void setAwayGoals(Integer awayGoals);
}
