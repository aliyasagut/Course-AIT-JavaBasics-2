## ForEach Method
lesson 37

```sh
List<String> numbers = new ArrayList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");

        for( String number : numbers){
            System.out.println(number);
        }

        numbers.forEach(number -> System.out.println(number));
```
