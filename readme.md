# Java 8 features

* Lambdas
#### Functional Interfaces
* Consumer and BiConsumer
* Predicate and BiPredicate
* Functional Interface - Function and BiFunction
* Unary and Binary operator
* Supplier - no input arguments, returns one type

#### Constructor and Method references
* Method reference: simplifies lambda expressions
```$xslt
ClassName::instance-methodName
ClassName::static-methodName
Instance::methodName
```

* Constructor reference
ClassName::new

#### Rule for variables inside lambdas
* Cannot use or re-assign already defined local variables 

#### Stream API
* Used to perform operation on collections
* Parallel operations are easier to perform without having to spawn multiple threads
* operations can be performed sequentially or parallel

| Function|Description|
|---------------|:-------------:|
| .stream()| convert collection to stream API|
| .filter()| filter items with expression |
| .collect()|map to custom object - like aggregator; mostly used as terminating statement|
| .map()| |
| .flatMap()|used when each element is a collection/array|
| .reduce() | terminal operation like .collect(); reduce the contents of the stream to a single value |
| .limit(n) | get first n values |
| .skip(n) | skip first n values |
| .anyMatch() | returns true if any one element satisfies the predicate |
| .allMatch() | returns true only if all elements satisfy the condition |
| .noneMatch() | returns true if none satisfy the predicate |
| .findAny() | returns first encountered element |
| .findFirst() | returns first matching element in the stream |
  


#### Collections vs Streams:

|Collections|Streams|
|---|:---:|
|can add or modify elements|cannot modify elements|
|elements can be accessed in any order|only in one sequence|
|eagerly constructed|lazily constructed|
|Can be traversed more than once|Can be traversed only once|
|External iteration; you have to explicitly iterate through elements|Internal iteration|

#### Short-circuit functions:
* They don't have to iterate through the whole stream
* .limit(), 
* .findFirst(), and .findAny(), 
* .anyMatch(), .allMatch() and .noneMatch() 

#### Streams API factory methods:

|Function|Description|
|:----:|:----:|
|of() | creates stream of specified types|
|iterate() | create infinite streams|
|generate() | create infinite streams|

#### Numeric stream:
IntStream, LongStream, DoubleStream

|Function|Description|
|:----:|:----:|
|range(a,b) | produces int from a to b-1|
|rangeClosed(a,b) | produces int from a to b|
|sum() | |
|asDoubleStream(), asIntStream(), asLongStream() | |
|max() | |
|min() | |
|average() | |

#### Boxing, UnBoxing, mapToInt
|Function|Description|
|:----:|:----:|
|Boxing - boxed() | convert primitive to wrapper class type; Example: int to Integer|
|UnBoxing - mapToInt() | convert wrapper class type to primitive type; Ex: Integer to int |
|mapToObj() | convert items into stream of specified objects|
|mapToLong() | |
|mapToDouble() | |

#### Terminal Operations
|Function|Description|
|:----:|:----:|
|collect(joining()) | |
|collect(counting()) or count() | |
|collect(mapping()) | |
|collect(minBy()), collect(maxBy()) | |
|collect(summingInt()), collect(averagingInt()) | |
|collect(groupingBy(classifier)), collect(groupingBy(classifier, downstream)), collect(groupingBy(classifier, supplier, downstream)) | |
|collect(partitioningBy(predicate)), collect(partitioningBy(predicate, downstream)) | |

#### Parallel stream:
* split the source and process them in parallel
* combine the results

* don't use parallel() when mutable variables are involved

#### Optionals
* represents non-null value
* avoids unnecessary null pointer exceptions and checks

|Function|Description|
|:----:|:----:|
|orElse(), orElseGet(), orElseThrow() | |
|ifPresent(), isPresent() | |

#### Abstract classes vs Interfaces

| |Abstract classes|Interfaces|
|:----:|:----:|:----:|
|instance variable |allowed |not allowed |

* Java 8 supports multiple inheritance 
    * Java 8 runs child implementation over parent implementation whenever there is conflict in multiple inheritance

#### DateTime

* LocalDate is immutable



