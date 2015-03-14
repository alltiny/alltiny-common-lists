package org.alltiny.common.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * This utility class provides some methods native lists do provide.
 * @since 1.0
 */
public class Lists {

    /** No need to instantiate this class. */
    protected Lists() {}

    /**
     * This method will create a new List containing all elements of the original list
     * except the given elements. The original list stays unchanged.
     * @since 1.0
     */
    public static <Type> List<Type> remove(Collection<Type> original, Type... elements) {
        List<Type> copy = new ArrayList<>(original);
        for (Type element : elements) {
            copy.remove(element);
        }
        return copy;
    }

    /**
     * This method will copy all elements from the original list into the destination list
     * without copying the given elements. The original list stays unchanged.
     * @since 1.0
     */
    public static <Type> Collection<Type> remove(Collection<Type> destination, Collection<Type> original, Type... elements) {
        destination.addAll(original);
        for (Type element : elements) {
            destination.remove(element);
        }
        return destination;
    }

    /**
     * This method will join the original list and the given elements in a new list.
     * The original list stays unchanged.
     * @since 1.0
     */
    public static <Type> List<Type> join(Collection<Type> original, Type... elements) {
        List<Type> copy = (original != null) ? new ArrayList<>(original) : new ArrayList<Type>();
        Collections.addAll(copy, elements);
        return copy;
    }
}
