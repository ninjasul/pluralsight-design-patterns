package structural._02_bridge.movieformatter;

import lombok.*;

@AllArgsConstructor
@Getter @Setter
@ToString
@Builder
public class Movie {
    private String classification;
    private String title;
    private String runtime;
    private String year;
}