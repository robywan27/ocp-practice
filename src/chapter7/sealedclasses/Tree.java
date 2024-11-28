package chapter7.sealedclasses;

/*
* - sealed: a class/interface may only be extended/implemented by named classes/interfaces
* - permits: used to list the classes/interfaces allowed
*
* Sealed classes must be declared in the same package or named module as their direct subclasses
* */

public sealed class Tree permits Node, Edge {}

final class Node extends Tree {}

non-sealed class Edge extends Tree {}
