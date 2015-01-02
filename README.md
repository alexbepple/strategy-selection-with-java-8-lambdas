[![Anti-If Campaign](http://antiifcampaign.com/wp-content/themes/anti-if/images/home/what-is-this.svg)](http://antiifcampaign.com/)


# What is this?

This code demonstrates the selection of an algorithm with Java 8 lambdas.

We write code that does something like this all the time: for each element of a list, 

* do A, if the element is of type X,
* do B, otherwise.

The [strategy pattern](http://sourcemaking.com/design_patterns/strategy) is a well known solution to this problem. It increases cohesion and reduces coupling. The Holy Grail.

Selecting a strategy in Java used to involve some ugly for–if nesting. With Java 8 lambdas we can do better.

The package `simple` uses anonymous strategies, while `with_domain_classes` uses named strategies.


# Working with the code

Run all tests with `./gradlew` (*nix) or `gradlew.bat` (Windows)

Create project files with `./gradlew eclipse` or `./gradlew idea`

