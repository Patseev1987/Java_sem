package Sem3;

import java.util.ArrayList;
import java.util.List;

public class Planets {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Mercury");
        ArrayList<Integer> countPlanet = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();
        for (String planet:planets) {
            int position = resultList.indexOf(planet);
            if (position>=0) {
                countPlanet.set(position, countPlanet.get(position) + 1);

            } else     {
    resultList.add(planet);
    countPlanet.add(1);
            }
        }
printPlanetCount(resultList,countPlanet);
    }

    private static void printPlanetCount(List<String> planets, List<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }
}
