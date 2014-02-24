package uk.co.mindbadger.footballresultsanalyser.domain.v2;

import java.io.Serializable;

public interface Season extends Serializable {
    public Integer getSeasonNumber ();
    public void setSeasonNumber (Integer seasonNumber);    
}
