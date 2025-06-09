// ----------------------------------------------------------------------------------------------------------------//
                                    Terminal Functions
// ----------------------------------------------------------------------------------------------------------------//

1. collect() -> Collect results into collections or strings

List<String> list = Stream.of("a", "b", "c")
                          .collect(Collectors.toList());

String joined = Stream.of("a", "b", "c")
                      .collect(Collectors.joining("-"));  // a-b-c

// ----------------------------------------------------------------------------------------------------------------//
        
2. forEach() – Perform an action for each element

List.of("One", "Two", "Three")
    .forEach(System.out::println);

// ----------------------------------------------------------------------------------------------------------------//

3. reduce() – Combine elements into one

int sum = Stream.of(1, 2, 3)
                .reduce(0, Integer::sum);  // Output: 6

// ----------------------------------------------------------------------------------------------------------------//
                
4. anyMatch() / allMatch() / noneMatch() – Matching conditions

Stream.of(1, 2, 3).anyMatch(n -> n > 2);    // true
Stream.of(1, 2, 3).allMatch(n -> n > 0);    // true
Stream.of(1, 2, 3).noneMatch(n -> n < 0);   // true

// ----------------------------------------------------------------------------------------------------------------//
