package lesson33.compare_interface;

public class Player implements Comparable<Player> {

    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age) {
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }

    public int getRanking() {
        return ranking;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    @Override
    public int compareTo(Player p) { // сравнение по рангу 1

        if (getRanking() - p.getRanking() > 0) {
            return 1;
        } else if (getRanking() - p.getRanking() < 0) {
            return -1;
        } else return 0;
    }
    */

    /*
    public int compareTo(Player p){ // сравнение по рангу 2
        return getRanking() - p.getRanking();
    }
    */

    /*
    public int compareTo(Player p) { // сравнение по рангу 3
        return Integer.compare(getRanking(), p.getRanking());
    }
     */

    /*
    public int compareTo(Player p) { // сравнение по именам
        return getName().compareTo(p.getName());
    }
     */

    public int compareTo(Player p) { // сравниваем имена, если имена одинаковые, то сортируем по возрасту

        int comparePlayerName = getName().compareTo(p.getName());
        return comparePlayerName == 0 ? Integer.compare(getAge(), p.getAge()) : comparePlayerName;

    }

}

