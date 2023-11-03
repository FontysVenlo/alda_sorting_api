package sortingservice;

import java.util.stream.Stream;

/**
 * Factory service for sorter configurations to test.
 *
 * Provides The implementing class provides sorter configurations that a
 * student wants to be tested by the teacher tests.
 *
 * @author Pieter van den Hombergh / Richard van den Ham.
 */
public interface SortingServiceFactory {

    /**
     * 
     * @return a stream of all sorter configurations that should be tested.
     */
    Stream<SorterConfiguration> streamSorterConfigurations();
}