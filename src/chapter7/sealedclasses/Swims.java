package chapter7.sealedclasses;

// sealed interfaces: limit the classes/interfaces that can implement/extend them

public sealed interface Swims permits Duck, Swan, Floats {}

final class Duck implements Swims {}
final class Swan implements Swims {}
non-sealed interface Floats extends Swims {} // cannot be marked final!
