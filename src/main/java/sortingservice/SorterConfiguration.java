package sortingservice;

import java.util.Comparator;

/**
 * Configuration for a specific sorter.
 *
 * @author Richard van den Ham (r.vandenham@fontys.nl)
 */
public interface SorterConfiguration {

    /**
     * Get name of sorter implementation.
     * @return name
     */
    String getName();

    /**
     * Get the SortKind of the sorter implementation.
     * @return sortKind
     */
    SortKind getSortKind();

    /**
     * Indicates whether this sorter uses a Priority Queue.
     * @return true if configuration uses priority queue, false otherwise.
     */
    boolean usesPriorityQueue();
    
    /**
     * Get queue for sorter.
     * @param <T> the type of elements in the queue
     * @return queue for sorter, or null if configuration uses a priority
     * queue (see {@link #getPriorityQueue(Comparator)}).
     */
    <T> Queue<T> getQueue();

    /**
     * Get priority queue.
     * @param <T> the type of elements in the queue
     * @param comparator to compare elements in the queue
     * @return priority queue or null if configuration does not use priority
     * queue.
     */
    <T> PriorityQueue<T> getPriorityQueue(Comparator<T> comparator);

    /**
     * Get a sorter.
     * A configuration that uses a priority queue returns a sorter that
     * returns the queue as is, since the priority queue sorts by itself.
     * @param <T> the type of elements in the queue
     * @return sorter, or null if configuration uses a key sorter (see
     * {@link #getKeySorter()}).
     */
    <T> Sorter<T> getSorter();

    /**
     * Indicates whether this sorter uses a key sorter.
     * @return true if configuration uses key sorter, false by default.
     */
    default boolean usesKeySorter() {
        return false;
    }

    /**
     * Get a key sorter.
     * @param <T> the type of elements in the queue
     * @return key sorter or null if configuration does not use a key sorter,
     * null by default.
     */
    default <T> KeySorter<T> getKeySorter() {
        return null;
    }

    /**
     * Indicates whether the teacher tests should test this configuration.
     * Your own tests should test all configurations.
     *
     * @return true if the teacher tests should test this configuration,
     * true by default.
     */
    default boolean applyTeacherTests() {
        return true;
    }
}
