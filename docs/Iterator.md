## Iterator
Interface Iterable
Lesson 36-37

Итератор - один из методов интерфейса Collections. Он возвращает объект реализующий интерфейс Iterator.
      
Методы интерфейса Iterator:
- E next () - возвращает следующий элемент коллекции
- boolean hasNext () - проверяет не достигнут ли конец коллекции, есть ли следующий элемент
- remove () - удаляет текущий элемент (полученный последним вызовом метода next () )

```sh
System.out.println("Iterator printing");
Iterator<String> ourIterator = names.iterator();

while (ourIterator.hasNext()){
  System.out.println(ourIterator.next());
  }

System.out.println("Delete with Iterator");
while (ourIterator.hasNext()){
  if(ourIterator.next().equals("Ann"))
  ourIterator.remove();
  }
```
