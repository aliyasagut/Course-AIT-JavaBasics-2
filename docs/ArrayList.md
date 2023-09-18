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

List<Integer> list1 = Arrays.asList(1, 2, 300, 4); // this list is amutable

List<Integer> list2 = List.of(5, 2, 300, 8); // this list can be changed

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

  ## ArrayList

Programmers were very unhappy with one property of an array - its size cannot be changed. What should you do if you need to store three more elements in the array, but there's only one free space?

The only solution to the problem of insufficient space in the array was to create a very large array to ensure that all the elements would fit in. However, this often led to irrational memory consumption. If most of the time the array only stored three elements, but there was even a tiny chance that there would be 100, you had to create an array with 100 elements.

So, they wrote a class called ArrayList, which performed the same task as an array but could change its size.

Inside each ArrayList object, a regular array of elements is stored. When you read elements from the ArrayList, it reads them from its internal array. When you write, it writes them to the internal array.

## Advantages of ArrayList

Firstly, ArrayList supports several additional operations that programmers often need to perform while working, which are not available in arrays. For example, inserting and deleting elements from the middle of the array without leaving gaps.

Secondly, resizing: when you need to write one more element into the internal array, but there is no free space, here's what happens inside ArrayList: another array is created, one and a half times the size of the internal array, plus one element. All elements from the old array are copied to the new array. The new array is saved in the internal variable of the ArrayList object, and the old array is declared as garbage (we simply stop holding a reference to it).

## ArrayList
Программистам очень не нравилось одно свойство массива – его размер нельзя изменять. Что делать, если нужно сохранить в массиве ещё три элемента, а свободное место только одно?

Единственным решением проблемы нехватки места в массиве было создание массива очень большого размера, чтобы все элементы туда точно поместились. Но это часто приводило к нерациональному расходу памяти. Если чаще всего в массиве хранилось три элемента, но был хотя бы мизерный шанс, что там их будет 100, приходилось создавать массив на 100 элементов.

Поэтому они написали класс ArrayList (списочный массив), который выполнял ту же работу, что и массив, но мог изменять свой размер.

Внутри каждого объекта типа ArrayList хранится обычный массив элементов. Когда ты считываешь элементы из ArrayList, он считывает их из своего внутреннего массива. Когда записываешь – записывает их во внутренний массив.

## Преимущества ArrayList
Во-первых, ArrayList поддерживает несколько дополнительных действий, которые очень часто приходится делать программистам во время работы, и которых нет у массива. Например – вставка и удаление элементов из середины массива, и чтобы не оставалось дырок.

Во-вторых, изменение размера: когда нужно записать во внутренний массив ещё один элемент, а свободного места там нет, то внутри ArrayList делается вот что: создаётся ещё один массив, в полтора раза больше размера внутреннего массива, плюс один элемент. все элементы из старого массива копируются в новый массив. новый массив сохраняется во внутренней переменной объекта ArrayList, старый массив объявляется мусором (мы просто перестаём хранить на него ссылку).
