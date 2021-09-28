import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
        Collections.sort(heroes);

        System.out.println("\nOrder by name:");
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        Comparator<Hero> heroAgeComparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o2.getAge() - o1.getAge();
                //Long Version:
                /*if(o2.getAge() < o1.getAge()) {
                    return -1;
                } else if (o2.getAge() > o1.getAge()) {
                    return 1;
                } else {
                    return 0;
                }*/
            }
        };

        Collections.sort(heroes,heroAgeComparator);

        //Sorting with Lambda Expression:
        //Collections.sort(heroes, Comparator.comparing(Hero::getAge).reversed());
        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero hero : heroes) {
            System.out.println(hero.getName() + ", " + hero.getAge());
        }
    }
}