package uk.co.mindbadger.footballresultsanalyser.dao.v2;

import java.util.Map;
import java.util.Set;

import uk.co.mindbadger.footballresultsanalyser.domain.v2.Division;
import uk.co.mindbadger.footballresultsanalyser.domain.v2.SeasonDivision;

public interface DivisionDAO {
    public Map<Integer, Division> getAllDivisions ();
    
    public Division addDivision (String divisionName);
        
    public Set<SeasonDivision> getDivisionsForSeason (int seasonNumber);        
}
