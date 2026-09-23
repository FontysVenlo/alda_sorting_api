package sortingservice;

import java.util.stream.Stream;

/**
 * Factory service for sorter configurations.
 *
 * The implementing class provides all sorter configurations that a student
 * implemented. Whether the teacher tests test a configuration is decided by
 * {@link SorterConfiguration#applyTeacherTests()}.
 *
 * @author Pieter van den Hombergh / Richard van den Ham.
 */
public interface SortingServiceFactory {

    /**
     * Get all configured sorter configurations.
     *
     * @return a stream of all configured sorter configurations.
     */
    Stream<SorterConfiguration> streamSorterConfigurations();
}