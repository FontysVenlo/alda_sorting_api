package sortingservice;

import java.util.Comparator;
import java.util.Iterator;

/**
 * Priority queue used by the Heap sorter.
 *
 * @author Richard van den Ham (r.vandenham@fontys.nl)
 * @param <E> Type of elements in Priority Queue
 */
public interface PriorityQueue<E> extends Queue<E> {

    /**
     * Remove SMALLEST element of the queue and return it.
     * The ordering is based on the {@code Comparator<E>} provided to the 
     * constructor.
     *
     * @return the SMALLEST element in this queue, or null if queue is empty.
     */
    @Override
    E get();

    /**
     * Get the comparator used to compare elements.
     * @return comparator
     */
    Comparator<E> getComparator();
    
    /**
     * Iterator to iterate over Priority queue.
     * Hint to implementer: we expect the implementation to CONSUME the 
     * priority queue. This means that the hasNext() method checks if the priority
     * queue is not empty and the next() method invokes the get() method. As a 
     * result, the iterator will return elements in sorted order and after 
     * using the iterator, the priority queue will be empty.
     * 
     * @return iterator 
     */
    @Override
    Iterator<E> iterator();
}
