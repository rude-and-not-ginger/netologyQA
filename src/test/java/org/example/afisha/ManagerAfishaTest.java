package org.example.afisha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerAfishaTest {
    ManagerAfisha manager = new ManagerAfisha();
    MovieSaver first = new MovieSaver(1, 1, "Hotel", 1999);
    MovieSaver second = new MovieSaver(2, 2, "Mary", 2999);
    MovieSaver third= new MovieSaver(3, 3, "Lamb", 3299);
    MovieSaver fourth= new MovieSaver(4, 4, "Kikiriki", 3199);
    MovieSaver fifth = new MovieSaver(5, 5, "Lele", 1999);
    MovieSaver sixth = new MovieSaver(6, 6, "Ajda", 2999);


    @Test
    public void shouldAddMovies() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        MovieSaver[] actual = manager.getAll();
        MovieSaver[] expected = new MovieSaver[]{sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDeleteById() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(2);

        MovieSaver[] actual = manager.getAll();
        MovieSaver[] expected = new MovieSaver[]{third, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void returnLastMovies() {
        ManagerAfisha manager = new ManagerAfisha(4);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

       MovieSaver[] actual = manager.getLast();
       MovieSaver[] expected = new MovieSaver[] {sixth, fifth, fourth, third};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void removeAllMovies() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        MovieSaver[] actual = manager.removeAll();
        MovieSaver[] expected = new MovieSaver[0];

        assertArrayEquals(expected, actual);
    }
}