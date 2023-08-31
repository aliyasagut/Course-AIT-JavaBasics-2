package lesson33.compare_interface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Интерфейс Comparable
        /*
        Используется для сравнения однотипных объектов и позволяет сортировать объекты
        в соответствии с определенным порядком. Для этой цели нужно переопределить единственный
        метод интерфейса compareTo()

        int compareTo ( Object o1 )
        Метод сравнивает объект, на котором он вызывается со вторым объектом.
        Результат его работы - целое число, которое:
        - больше нуля, если первый объект больше второго
        - меньше нуля, если меньше
        - равно нулю, если объекты равны

        Сравнение происходит по отдельным полям, то есть необходимо принять решение, какое поле класса
        будет участвовать в определении порядка сортировки обекта.
        Такой порядок будет называться естественным порядком сортиовки.
         */

        int[] ints = {45, 2, 15, 0, 5};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        String[] names = {"John", "Jack", "Ann", "Bill"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Player player1 = new Player(3, "Jack", 21);
        Player player2 = new Player(1, "Stive", 19);
        Player player3 = new Player(2, "Alex", 24);

        Player[] team = {player1, player2, player3};
        System.out.println(Arrays.toString(team));
        Arrays.sort(team);
        System.out.println(Arrays.toString(team));
    }
}
