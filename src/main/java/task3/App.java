package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<City> cities = new ArrayList<>();
        List<Street> streets = new ArrayList<>();

        //List<String> namesOfStreets = countries.
    }

    public List<String> streets(List<Country> countries) {
        //List<Country> countries = new ArrayList<>();
        List<String> namesOfStreets = countries.stream()
                .flatMap(country -> country.getCities().stream()
                        .flatMap(city -> city.getStreets().stream()
                                .map(street -> street.getTitle())
                                .filter(title -> title.toCharArray()[0] == 'A')
                        ).sorted()
                ).collect(Collectors.toList());

        return namesOfStreets;
    }
}
