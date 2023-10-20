import models.Person;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Set<Person> people = new TreeSet<>();
    people.add(new Person("Juan Méndez",18));
    people.add(new Person("Juan Posada",18));
    people.add(new Person("Torax",20));
    people.add(new Person("Freddy",50));
    people.add(new Person("Richard",30));

    Iterator<Person> iterator = people.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next().getName());
    }
  }
}