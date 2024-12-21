# Java Data Types

Java is a strongly typed language. Everything you see or write in java have particular type. Like, for numeric data, we usually use int or Long data type or for text based data we use String data type. We can consider there are two types of data types. One is primitive type and another one is non-primitive or object type. The non-primitive type usually user defined types.

**Java Data Types**
- Primitive Data Type: 
- Non-primitive or User Defined Type:

## Java Primitive Data Types

There are total 8 built in primitive types in java. Below, I present them with possible description.


<table style="width: 100%;">
    <tr>
        <th>Data Types</th>
        <th>Range</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>byte</td>
        <td>1 byte </td>
        <td>stores numeric values and the storage range is -2^7 to 2^7-1 (-128 to 127)</td>
    </tr>
    <tr>
        <td>short</td>
        <td>2 byte</td>
        <td>stores numeric values and the storage range is -2^15 to 2^15-1 (-32,768 to 32,767)</td>
    </tr>
    <tr>
        <td>int</td>
        <td>4 bytes</td>
        <td>stores numeric values and the range is -2^31 to 2^15-1 (-2,147,483,648 to 2,147,483,647)</td>
    </tr>
    <tr>
        <td>long</td>
        <td>8 bytes</td>
        <td>stores numeric values and the size is -2^63 to 2^63-1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)</td>
    </tr>
    <tr>
        <td>float</td>
        <td>4 bytes</td>
        <td>stores decimal number up to 6-7 decimal digits</td>
    </tr>
    <tr>
        <td>double</td>
        <td>8 bytes</td>
        <td>stores decimal number up to 15 decimal digits</td>
    </tr>
    <tr>
        <td>boolean</td>
        <td>1 bit</td>
        <td>stores only true or false value</td>
    </tr>
    <tr>
        <td>char</td>
        <td>2 bytes</td>
        <td>stores single character/letter or ASCII values</td>
    </tr>
    </table>

## Non Primitive Data Types

There are few built in non-primitive data types also available and we can also create our own user defined data types. Non primitive data types are: Strings, Arrays, Classes and Objects, Interface, Records and all user defined objects or types.

## Difference Between Primitive and Non-primitive Data Types

- Primitive is predefined and already reserved on the language itself, on the other hand non-primitives are user defined.
- Java Primitive types are in fixed size but there is no size or capacity limit of non-primitive types
- The memory allocation is stack for primitive data types, otherwise it is the heap memory area for non-primitive data types.
- Primitive doesn't support null value and always have a default value but non-primitive data types default value is null.
- primitive data types are used for handling simple task (such as,numbers, boolean, characters etc.) and non-primitives are used to handle complex task (such as, objects, arrays, Strings etc.). Though, non-primitives are also built with the combination of primitives.
- primitive stores data directly but non-primitive types store references in the location of data value.