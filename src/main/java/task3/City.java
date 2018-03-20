package task3;

import java.util.List;

public class City {

    private final List<Street> streets;

    public City(List<Street> streets) {
        this.streets = streets;
    }

    public List<Street> getStreets() {
        return streets;
    }


}
