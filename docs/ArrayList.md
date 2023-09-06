## ArrayList
Lesson 36

List and ArrayList - список в основе своей имеющий массив и количество элементов в листе не фиксировано.
    Имееет гораздо больше методов и возможностей, чем использую обычный массив. В том числе имеет 3 конструктора.

## Конструкторы:

    ArrayList () - создает ппустой лист
    ArrayList (Collection collection) - создается лист, в который добавляются все элементы коллекции collection.
    ArraList (int capacity) - список с начальным размером равным capacity.

```sh
List<String> names = new ArrayList<>();
```

https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

## Методы

  - Метод add() - добавление элемента в конец листа, возвращает true, если удалось добавить.
  
  names.add("John");

  - Метод add() - перегрузка, добавление элемента по индексу
  
  names.add(1, "Mary");

  - Метод size() - для определения размера листа
  
  names.size();

  - метод set(int index, новый элемент) - Изменить элемент
  
  names.set(2, "Ann");

  - метод get(int index) - получение элемента по индексу
 
  names.get(0);

  - метод boolean remove(Object o) - удаление элемента  по названию, возвращает булеан
  
  names.remove("Bill");

  - Object remove(int index) - удаление по индексу, возвращает удаленный объект
  
  names.remove(0);
  
  remove(Integer.valueOf(1));

  - int indexOf (Object o) - возвращает индекс элемента
  
  int position = names.indexOf("Ann");

  - boolean contains (Object o) - проверяет содержит ли лист данный элемент
  
  names.contains("Jack");

  - sort() - сортировка коллекций
  
  Collections.sort(names);

  
