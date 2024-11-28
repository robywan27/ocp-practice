package chapter7.sealedclasses;

/*
* Every class that directly extends a sealed class must specify exactly one of the following modifiers:
*   - final: subclass cannot be further extended
*   - sealed: same rules as parent class applies to subclass
*   - non-sealed: indicates that a class can be extended by unspecified classes
* */

public sealed class Shape permits Rectangular, Round, Triangle {}

sealed class Rectangular extends Shape {} // permits is optional when all subclasses are in the same file

sealed class Round extends Shape {}

non-sealed class Triangle extends Shape {}

final class Square extends Rectangular {}

final class Oval extends Round {}


class SquaredTriangle extends Triangle {}
class EquilateralTriangle extends Triangle {}
// there can be any other triangle class extending
