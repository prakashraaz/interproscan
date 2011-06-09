package uk.ac.ebi.interpro.scan.precalc.berkeley.conversion.toi5;

import uk.ac.ebi.interpro.scan.model.Protein;
import uk.ac.ebi.interpro.scan.precalc.berkeley.model.BerkeleyMatch;

import java.util.List;
import java.util.Set;

/**
 * TODO: Description
 *
 * @author Phil Jones
 * @version $Id$
 * @since 1.0-SNAPSHOT
 */
public interface BerkeleyToI5ModelDAO {

    void populateProteinMatches(Protein nonPersistedProtein, List<BerkeleyMatch> berkeleyMatches);

    void populateProteinMatches(Set<Protein> preCalculatedProteins, List<BerkeleyMatch> matches);
}
