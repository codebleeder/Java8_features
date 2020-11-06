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
| .collect()|map to custom object|

#### Collections vs Streams:

|Collections|Streams|
|---|:---:|
|can add or modify elements|cannot modify elements|
|elements can be accessed in any order|only in one sequence|
|eagerly constructed|lazily constructed|
|Can be traversed more than once|Can be traversed only once|
|External iteration|Internal iteration|