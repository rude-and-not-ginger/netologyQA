package org.example.afisha;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MovieSaver {
    private int id;
    private int movieId;
    private String movieName;
    private int movieYear;
}
