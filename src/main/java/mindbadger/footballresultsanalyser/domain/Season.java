package mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface Season extends Serializable {
    public Integer getSeasonNumber ();
    public void setSeasonNumber (Integer seasonNumber);
}
