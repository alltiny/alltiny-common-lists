package org.alltiny.common.lists;

import java.util.*;

/**
 * This class helps building combinations of candidates. Distinct means each
 * combination appears only once.
 * @since 1.0
 */
public class Combinations {

    /** No need to instantiate this class. */
    protected Combinations() {}

    /**
     * This method will create all unique pairs of the given candidates.
     * @since 1.0
     */
    public static <Type> Set<List<Type>> joinDistinct(Collection<Type> candidates) {
        return joinDistinct(candidates, 2, null);
    }

    /**
     * This method will create all unique combinations of the given candidates.
     * The create combinations will contain as many candidates as dimension is set.
     * @since 1.0
     */
    public static <Type> Set<List<Type>> joinDistinct(Collection<Type> candidates, final int dimension) {
        return joinDistinct(candidates, dimension, null);
    }

    /**
     * This method will create all possible combinations of the given candidates. Distinct means
	 * that each combination will regardless of order of their elements only appear once. The
	 * parameter dimension determines who may elements each combination shall have. If a starting
	 * combination is given, then the result are only those combinations which include the starting
	 * combination.
     * @param candidates all candidates which are available for building combinations/tuples.
     * @param dimension number of elements each resulting combination/tuple must have
     * @param combination all resulting combination must contain; can be null for none
     * @since 1.0
     */
    public static <Type> Set<List<Type>> joinDistinct(Collection<Type> candidates, final int dimension, List<Type> combination) {
        Set<List<Type>> tuples = new HashSet<>();
        if (combination != null && combination.size() == dimension) {
            tuples.add(combination);
        } else if (combination == null || combination.size() < dimension) {
            List<Type> availableCandidates = new ArrayList<>(candidates);
            // extend the existing combination with the given candidates.
            for (Type candidate : candidates) {
                availableCandidates.remove(candidate);
                tuples.addAll(joinDistinct(availableCandidates, dimension, Lists.join(combination, candidate)));
            }
        }
        return tuples;
    }
}