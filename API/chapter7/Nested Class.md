## Types
| Type                | Description                                    |
|---------------------|------------------------------------------------|
| inner class         | non-static type at member level                |
| static nested class | static type at member level                    |
| local class         | type defined within a method/constructor/block |
| anonymous class     | unnamed type defined within an expression      |

## Implicit modifiers
| Type          | Modifier |
|---------------|----------|
| nested record | static   |

## Special syntax
| What           | Description                                                                                      | Syntax                                                                                                               |
|----------------|--------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| all nested classes | access variable in enclosing class (mandatory when nested class defines variable with same name) | EnclosingClassName.this.memberName                                                                                   |
| inner class | instantiate (one level of nesting) | [EnclosingClassName.]InnerClassName innerObject = enclosingObject.new InnerClassName();                              |
| | instantiate (multiple levels of nesting) | OutermostEnclosingClassName.OuterEnclosingClassName.InnerClassName innerObject = enclosingObject.new InnerClassName(); |
| static nested class | instantiate (outside enclosing class) | EnclosingClassName.StaticNestedClassName nestedObject = new EnclosingClassName.StaticNestedClassName(); |
| anonymous class | instantiate and define | new SuperClassOrInterface(constructorArgs) { // method overrides etc }

## Rules
| MUST            |                                          | CANNOT          |                                                | CAN                 |                                                                                                            |
|-----------------|------------------------------------------|-----------------|------------------------------------------------|---------------------|------------------------------------------------------------------------------------------------------------|
| anonymous class | extend a class or implement an interface |                 |                                                |                     |                                                                                                            |
|                 |                                          | local class     | have an access modifier                        |                     |                                                                                                            | 
|                 |                                          |                 | be marked abstract or final                    |                     |                                                                                                            |
|                 |                                          | anonymous class | have an access modifier                        |                     |                                                                                                            |
|                 |                                          |                 | be marked abstract or final                    |                     |                                                                                                            |
|                 |                                          |                 | both implement an interface and extend a class |                     |                                                                                                            |
|                 |                                          |                 |                                                | inner class         | be declared private, protected, package-private, or public                                                 |
|                 |                                          |                 |                                                |                     | extend another class or implement interfaces                                                               |
|                 |                                          |                 |                                                |                     | be marked abstract or final                                                                                |
|                 |                                          |                 |                                                |                     | access instance members of the enclosing class directly                                                    |
|                 |                                          |                 |                                                | static nested class | be declared private, protected, package-private, or public                                                 |
|                 |                                          |                 |                                                |                     | extend another class or implement interfaces                                                               |
|                 |                                          |                 |                                                |                     | be marked abstract or final                                                                                |
|                 |                                          |                 |                                                |                     | the enclosing class can refer to fields and methods of the static nested class directly, even private ones |
|                 |                                          |                 |                                                | local class         | be declared final or abstract                                                                              |
|                 |                                          |                 |                                                |                     | access instance members of the enclosing class directly                                                    |
|                 |                                          |                 |                                                |                     | access only final or effectively final local variables                                                     |
|                 |                                          |                 |                                                |                     | include instance and static members                                                                        |
|                 |                                          |                 |                                                | anonymous class     | access instance members of the enclosing class directly                                                    |
|                 |                                          |                 |                                                |                     | access only final or effectively final local variables                                                     |
|                 |                                          |                 |                                                |                     | include instance and static members                                                                        |
