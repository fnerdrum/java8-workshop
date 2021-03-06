package no.bekk.java.examples;

import no.bekk.java.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    static class Java7 {

        public static List<String> getBrands(List<Car> cars) {
            List<String> brands = new ArrayList<>();
            for (Car car : cars) {
                brands.add(car.getBrand());
            }
            return brands;
        }

    }


    static class Java8 {
        public static List<String> getBrands(List<Car> cars) {
            return cars.stream()
                    .map(car -> car.getBrand())
                    .collect(Collectors.toList());
        }
    }

}
