package structural._02_bridge.movieformatter;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class MoviePrinter extends Printer {

    private Movie movie;

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(Detail.builder().label("Title").value(movie.getTitle()).build());
        details.add(Detail.builder().label("Year").value(movie.getYear()).build());
        details.add(Detail.builder().label("Runtime").value(movie.getRuntime()).build());

        return details;
    }
}