package uk.co.mindbadger.footballresultsanalyser.domain;

import java.io.Serializable;

public interface Season<K> extends Serializable {
    public Integer getSeasonNumber ();
    public void setSeasonNumber (Integer seasonNumber);
}
