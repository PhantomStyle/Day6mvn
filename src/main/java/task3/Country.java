package task3;


import java.util.List;

class Country {
    private final List<City> cities;

    public Country(List<City> cities) {
        this.cities = cities;
    }

    public List<City> getCities() {
        return cities;
    }
}