package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface Team<K> extends Serializable {
    public K getTeamId();
    public void setTeamId(K teamId);
    public String getTeamIdAsString();
    
    public String getTeamName();
    public void setTeamName(String teamName);
    
    public String getTeamShortName();
    public void setTeamShortName(String teamShortName);
}
