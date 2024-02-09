# tcstats

Warning: This is highly experimental and subject to change. Use at your own risk.

tcstats is a library that provides statistical functions for tablecloth datasets.
All of the current underlying functionality is provided by [fastmath](https://github.com/generateme/fastmath),
such that at the moment this library is essentially just a tablecloth adapter for fastmath.

## Usage

Include tcstats as a dependency in your project.

Invoke a library API function from the command-line:

    $ clojure -X scicloj.tcstats/foo :a 1 :b '"two"'
    {:a 1, :b "two"} "Hello, World!"

Run the project's tests (they'll fail until you edit them):

    $ clojure -T:build test

Run the project's CI pipeline and build a JAR (this will fail until you edit the tests to pass):

    $ clojure -T:build ci

This will produce an updated `pom.xml` file with synchronized dependencies inside the `META-INF`
directory inside `target/classes` and the JAR in `target`. You can update the version (and SCM tag)
information in generated `pom.xml` by updating `build.clj`.

Install it locally (requires the `ci` task be run first):

    $ clojure -T:build install

Deploy it to Clojars -- needs `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` environment
variables (requires the `ci` task be run first):

    $ clojure -T:build deploy

Your library will be deployed to net.clojars.scicloj/tcstats on clojars.org by default.

## License

Copyright © 2024 Kira McLean

Distributed under the MIT License.
