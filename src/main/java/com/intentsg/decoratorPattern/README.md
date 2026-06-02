## Decorator Pattern: Structural — Logger

Is useful when you want to add behavior to an object at runtime without
modifying its class and without creating a subclass for every possible
combination of features. Decorators wrap each other like layers, so you
compose exactly the behavior you need — and each layer stays small and focused
on one thing.

### Logger Decorator

A backend application needs flexible logging. Some parts of the app just print
a plain message. Others need a timestamp. Others need a log level like WARN or
ERROR. Some need all three, plus a context label showing which service the log
came from.

Each layer adds one thing. You mix and match at the point where you create the
logger, and nothing inside any class changes.
