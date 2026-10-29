package sortingservice;

import java.util.function.ToIntFunction;

/**
 * A key sorter sorts its input on an integer key, without comparing elements.
 *
 * <p>
 * Where a {@link Sorter} can only compare two elements with a
 * {@link java.util.Comparator Comparator}, a key sorter gets access to the
 * key of every element. This restriction on the input allows sorting in
 * linear time, e.g. with radix sort.
 * </p>
 *
 * The implementation is expected to return the <b>same</b> queue instance.
 *
 * @author Martijn Bonajo
 * @param <T> type of elements in queue.
 */
@FunctionalInterface
public interface KeySorter<T> {

    /**
     * Return the input queue in sorted order, based on the key of the elements.
     *
     * <p>
     * The sort is <b>stable</b>: elements with equal keys keep their relative
     * order.
     * </p>
     *
     * @param queue to be sorted
     * @param key extracts the key of an element, the key must be non-negative
     * @return the queue with the elements in non-descending order of their key.
     * @throws IllegalArgumentException if the key of an element is negative.
     */
    Queue<T> sort( Queue<T> queue, ToIntFunction<T> key );
}
