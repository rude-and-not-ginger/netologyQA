package org.example.afisha;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ManagerAfisha {
    private int lastMoviesLength = 3;
    private MovieSaver[] movies = new MovieSaver[0];

public ManagerAfisha(int lastMoviesLength){
    this.lastMoviesLength = lastMoviesLength;
};
    public void add(MovieSaver movie) {
        int length = movies.length + 1;
        MovieSaver[] tmp = new MovieSaver[length];

        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }
    public MovieSaver[] getAll() {
        MovieSaver[] result = new MovieSaver[movies.length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public void removeById(int id) {
        int length = movies.length - 1;
        MovieSaver[] tmp = new MovieSaver[length];
        int index = 0;
        for (MovieSaver movie : movies) {
            if (movie.getId() != id) {
                tmp[index] = movie;
                index++;
            }
        }
        movies = tmp;
    }

    public MovieSaver[] getLast() {
        MovieSaver[] result = new MovieSaver[lastMoviesLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public MovieSaver[] removeAll() {
        MovieSaver[] tmp = new MovieSaver[0];
        movies = tmp;
        return movies;
    }
}
