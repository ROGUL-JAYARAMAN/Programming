Intermediate Functions
1.map(function) -> transform each element based on the function
                    mapToInt -> map element to Integer - Integer.parseInt
                    mapToDouble -> map element to double - Integer.parseInt
                    mapToLong -> map element to Long - Integer.parseInt        
2.flatMap() -> flat the nested structure
3.distinct() -> remove duplicate elements
4.sorted() -> sort the stream
5.filter(condition) -> keeps the element that match with condition 
6.peek() -> used to perform side effects like logging or debugging.

Terminal Functions
1.collect() -> collect function used along with Collectors
               Collectors Functions : Collectors.function()
                        1.toList() -> convert To List
                        2.toSet() -> convert to Set
                        3.toMap(key,value) -> convert to map
                        4.count() -> no of element
                        5.summingInt() -> sum of element
                        6.averagingInt() -> average of element
                        7.joining("delimeter") -> join the elements based on delimeter
2.forEach() -> Iterate through each element & perform an action   
3.reduce(function) ->  convert the result into simpilified version based on the function - ("",fun)->String (0,fun)->int
4.allMatch(condition) -> function that check all element satisfy the condition - return true/false    
5.anyMatch(condition) -> function that check any element satisfy the condition - return true/false4
6.toArray(Object_dataType/Wrapper Class) -> convert stream to Array - Wrapper Class -> Integer::new / String::new / Character::new 
                                            result will be stored in Wrapper calss 