package structural._02_bridge.movieformatter;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MoviePrinterDemo {

    public static void main(String[] args) {
        Movie movie = Movie.builder()
                        .classification("Action")
                        .title("John Wick")
                        .runtime("2:15")
                        .year("2014")
                        .build();

       log.info("movieformatter: {}", movie);


       Printer moviePrinter = new MoviePrinter(movie);

       Formatter printFormatter = new PrinterFormatter();
       String printedMaterial = moviePrinter.print(printFormatter);
       log.info("printedMaterial: {}", printedMaterial);

       Formatter htmlFormatter = new HtmlFormatter();
       String htmlMaterial = moviePrinter.print(htmlFormatter);
       log.info("htmlMaterial: {}", htmlMaterial);
    }
}