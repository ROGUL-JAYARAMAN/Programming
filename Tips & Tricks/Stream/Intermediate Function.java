// ----------------------------------------------------------------------------------------------------------------//
                                            Intermediate Functions
// ----------------------------------------------------------------------------------------------------------------//
1. map() -> Transform each element

Stream.of(1, 2, 3)
      .map(n -> n * n)
      .forEach(System.out::println);  // Output: 1, 4, 9
      
// ----------------------------------------------------------------------------------------------------------------//

2. flatMap() -> Flatten nested structures

List<List<String>> names = List.of(
    List.of("a", "b"),
    List.of("c", "d")
);

names.stream()
     .flatMap(Collection::stream)
     .forEach(System.out::println);  // Output: a, b, c, d

// ----------------------------------------------------------------------------------------------------------------//

3. distinct() -> Remove duplicates

Stream.of(1, 2, 2, 3, 3, 3)
      .distinct()
      .forEach(System.out::println);  // Output: 1 2 3
      
// ----------------------------------------------------------------------------------------------------------------//

4. sorted() -> Sort elements

Stream.of(3, 1, 4, 2)
      .sorted()
      .forEach(System.out::println);  // Output: 1 2 3 4

// ----------------------------------------------------------------------------------------------------------------//

5. filter() -> Select elements based on a condition

Stream.of(1, 2, 3, 4, 5)
      .filter(n -> n % 2 == 0)
      .forEach(System.out::println);  // Output: 2, 4

