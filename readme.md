#Java 8 features

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