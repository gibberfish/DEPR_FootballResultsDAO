package uk.co.mindbadger.footballresultsanalyser.dao.v2;

import java.util.List;

import uk.co.mindbadger.footballresultsanalyser.domain.v2.Season;

public interface SeasonDAO {
    public List<Season> getSeasons ();
    public Season getSeason (Integer seasonNum);
    public Season addSeason (Integer seasonNum);
}
