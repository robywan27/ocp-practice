# Terminology
- serialization: process of converting an in-memory object to a byte stream that can be stored or transmitted
- deserialization: process of converting a byte stream to an in-memory object

## Serializable interface
- a marker interface (no methods) that indicates that a class can be serialized
- any class can implement Serializable
- any <b>transient</b> fields in a Serializable class will not be included in the serialized form of the object
- only instance fields are serialized; static fields keep their values for the duration of the program

### Serialize a class
- implement Serializable interface -> otherwise NotSerializableException is thrown
- every instance member of the class must be serializable, transient or have null value (all primitive type and String are serializable)

### Classes for serialization/deserialization
- ObjectInputStream - to deserialize an object
  - public Object readObject() throws IOException, ClassNotFoundException
- ObjectOutputStream - to serialize an object
  - public void writeObject(Object obj) throws IOException

## Deserialization process
- when the object is created, the constructor of the class and the instance initializers are not called
  - the no-arg constructor of the first non-serializable superclass is called to initialize the inherited state of the object
- static and transient fields are not deserialized; they are initialized to their default values unless value is provided

