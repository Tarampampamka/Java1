package HOmeWork;

import java.util.Arrays;

public class Person implements Comparable<Person> {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args){
        Person[] persons = {
                new Person("Петя"),
                new Person("Вася"),
                new Person("Коля"),
                new Person("Даша"),
                new Person("Маша")
        };
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
/*public class Num  implements Comparable <Num>{
    int num;
    public Num(int num){
        this.num = num;
    }
    @Override
    public int compareTo(Num o){
        Integer a = new Integer(this.num);
        Integer b = new Integer(o.num);
        return a.compareTo(b);
    }
}*/


