package sortingservice;

/**
 * Kinds of sorters.
 *
 * Set of requested sorter types.
 *
 * @author Pieter van den Hombergh {@code pieter.van.den.hombergh@gmail.com}
 */
public enum SortKind  {
    /**
     * Selection sort.
     */
    SELECTION,
    /**
     * Insertion sort.
     */
    INSERTION,
    /**
     * Quick sort.
     */
    QUICK,
    /**
     * Heap sort.
     */
    HEAP;
}
