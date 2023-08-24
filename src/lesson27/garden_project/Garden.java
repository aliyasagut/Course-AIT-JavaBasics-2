package lesson27.garden_project;

public class Garden {
    /*
    Садовод-любитель.
    Выращиваем деревья и цветы. Каждый из этих видов будет иметь следующие характеристики:
    name, height, age. Каждый из этих видов вырастает на разную высоту за сезон,
    причем эта высота одинаковая для всех деревьев и всех цветов.
    Каждый год начинается весной и состоит из 4 времен года, во время которых оведение деревьев и цветов может отличаться.

    Цветы: год начинается весной и они растут.
    летом они не растут, а цветут.
    осенью их срезают
    зимой не растут

    Деревья: сезон начинаетс весной и они растут
    Летом - растут
    Осенью деревья не растут
    Зимой деревья не растут

    В классе Garden созадть метод growPlants,
    в котором должен быть отражен процесс роста нескольких растений в течении нескольких лет.
    Что происходит зимой, летом, весной и осенью в каждый сезон и какого они роста и возраста в конце процесса.

    например:
    Pine tree has grown in Spring - 100
    Pine tree has grown in Summer - 115
    Pine tree has not grown in Autumn - 115
    Pine tree has not grown in Winter - 115
    Tulip has grown in Spring - 24
    -------------
    Pine tree has height 250 and is 5 years old

    Алгоритм решения:
    1. создать родительсикй класс Plant
    2. создать дочерние класса Flower и Tree
    3. создать в этих классах методы, характеризующие поведение цветов и деревьев
       в соответствующй период (лето, весна, осень, зима).
       Методы:
       doSpring()
       doSummer()
       doWinter()
       doAutumn()
       в родительском классе должны быть поля: name, heiht, age.
       в дочерних классах доп поля: константа grouthPerSeason для flower=2 и tree=5

    4. метод growPlants должен производить действия над массивом объектов типа plant

     */

    public static void growPlants(Plant[] plants, int years) {
        System.out.println("Growing plants for " + years + " years");

        for (int i = 0; i < years; i++) {
            for (Plant plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }
        }
        for (Plant plant : plants) {
            System.out.println(plant.getName() + " has height " + plant.getHeight() + " and is " + plant.getAge() + " years old.");
        }

    }

    public static void main(String[] args) {
        Plant tree = new Tree("Pine tree", 100, 1);
        Plant flower = new Flower("Tulip", 0, 1);
        Plant flower1 = new Flower("Rose", 20, 1);

        Plant[] plants = {flower, flower1, tree};
        int years = 2;

        growPlants(plants, years);
    }
}
