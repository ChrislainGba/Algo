package com.xl1.copy;

class Person implements Cloneable {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class CopyExample {
	public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("John");
        Person person2 = (Person) person1.clone();

        System.out.println(person1.name);  // John
        System.out.println(person2.name);  // John

        // Modification dans la copie superficielle
        person1.name = "Jane";

        System.out.println(person1.name);  // Jane
        System.out.println(person2.name);  // Jane
        
        String originalString = "Hello";
        System.out.println(originalString.hashCode());
        String modifiedString = originalString.concat(", World!");
        originalString = originalString.concat(", World!");

        System.out.println(originalString.hashCode());  // "Hello" (inchangé)
        System.out.println(modifiedString.hashCode());  // "Hello, World!
        System.out.println(originalString.hashCode());
        
        System.out.println("*********mutable********"); 
        int originalInt= 5;
        System.out.println(System.identityHashCode(originalInt));
        originalInt = 6;
        int originalInt1 = originalInt; 
        System.out.println(System.identityHashCode(originalInt));
        System.out.println(System.identityHashCode(originalInt1));
    }
}
