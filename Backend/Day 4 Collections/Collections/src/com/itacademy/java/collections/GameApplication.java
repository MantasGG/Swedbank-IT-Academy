package com.itacademy.java.collections;

import java.util.*;

public class GameApplication {
    public static void main(String[] args) {
        Game game1 = new Game("Amnesia",Genre.GENRE1, 50, 1000);
        Game game2 = new Game("Machine",Genre.GENRE2, 30, 3000);
        Game game3 = new Game("Mass Effect1",Genre.GENRE3, 40, 5000);
        Game game4 = new Game("Mass Effect2",Genre.GENRE4, 60, 10000);

        List<Game> games = new ArrayList<>();

        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);

        Print(games);

        System.out.println("--------*");

        Collections.sort(games, new PriceComparator());

        games.remove(1);

        Print(games);
        System.out.println("-------");

        Collections.sort(games, new PriceComparator().reversed());

        Print(games);

        System.out.println("-------");

        games.stream().forEach(game -> game.incrementPrice(100));

        Print(games);

        System.out.println("------- Filter by price");

        List<Game> byPrice = games.stream().filter(game -> game.getPrice() > 140).toList();
        Print(byPrice);

        System.out.println("------- Filter by copies sold");

        List<Game> byCopiesSold = games.stream().filter(game -> game.getCopiesSold() > 2000).toList();
        Print(byCopiesSold);

        List<Game> sorted = games.stream().sorted(Comparator.comparingInt(Game::getCopiesSold)).toList();
        System.out.println(sorted);

        Optional<Game> minAgeStudent = games.stream().min(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println(minAgeStudent.get());
        Optional<Game> maxAgeStudent = games.stream().max(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println(maxAgeStudent.get());
    }

    static public void Print(List<Game> games) {
        for (Game game : games) {
            System.out.println(game.toString());
        }
    }
}
