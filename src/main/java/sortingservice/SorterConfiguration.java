package sortingservice;

import java.util.Comparator;

/**
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
     * @return queue for sorter
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
     * @param <T> the type of elements in the queue
     * @return sorter
     */
    <T> Sorter<T> getSorter();
}
