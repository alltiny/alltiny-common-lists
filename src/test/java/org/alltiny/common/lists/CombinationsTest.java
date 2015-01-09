package org.alltiny.common.lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * This test ensures {@link org.alltiny.common.lists.Combinations} is working.
 */
public class CombinationsTest {

    /**
     * This test builds pairs out of a, b, c; In total three combinations are possible.
     */
    @Test
    public void testJoinDistinct1() {
        Collection<List<String>> tuples = Combinations.joinDistinct(Arrays.asList("a", "b", "c"));
        Assert.assertNotNull("collection should not be null", tuples);
        Assert.assertEquals("number of entries in collection", 3, tuples.size());
    }

    /**
     * This test builds triplet out of a, b, c, d, e; In total 10 combinations are possible.
     */
    @Test
    public void testJoinDistinct2() {
        Collection<List<String>> tuples = Combinations.joinDistinct(Arrays.asList("a", "b", "c", "d", "e"), 3);
        Assert.assertNotNull("collection should not be null", tuples);
        Assert.assertEquals("number of entries in collection", 10, tuples.size());
    }

    /**
     * This test joins a with b and c. All resulting tuples should contain a.
     */
    @Test
    public void testJoinDistinctWithGivenCombination() {
        Collection<List<String>> tuples = Combinations.joinDistinct(Arrays.asList("b", "c"), 2, Arrays.asList("a"));
        Assert.assertNotNull("collection should not be null", tuples);
        Assert.assertEquals("number of entries in collection", 2, tuples.size());
        for (List<String> tuple : tuples) {
            Assert.assertTrue("each tuple should contain \"a\"", tuple.contains("a"));
        }
    }
}
