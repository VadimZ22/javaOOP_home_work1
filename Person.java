package Home_Work1;

import java.util.ArrayList;
import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private Person mother;
    private Person father;
    private ArrayList<Person> children = new ArrayList<>();
    private ArrayList<Person> sisAndBro = new ArrayList<>();


    public Person(String name, int age, Person mother, Person father) {
//        this(name, age);
        this.name = name;
        this.age = age;
        if (mother != null) {this.setMother(mother);}
        if (father != null) {this.setFather(father);}

    }

    public Person(String name, int age) {
        this(name, age, null, null);
//        this.name = name;
//        this.age = age;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Person> getSisAndBro() {
        return sisAndBro;
    }

    public void setSisAndBro(Person sisAndBro) {
        if (!this.sisAndBro.contains(sisAndBro) && !sisAndBro.equals(this)) {
            this.sisAndBro.add(sisAndBro);
        }
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(Person children) {
        if (children.age < this.age) {
            this.children.add(children);
        }

    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        if (mother.age > this.age){
            this.mother = mother;
            mother.setChildren(this);
                for (Person p : mother.getChildren()){
                    this.setSisAndBro(p);
                    p.setSisAndBro(this);
                }

        }
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        if (father.age > this.age) {
            this.father = father;
            father.setChildren(this);
            for (Person p : father.getChildren()){
                this.setSisAndBro(p);
                p.setSisAndBro(this);
            }
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);// &&
//                Objects.equals(mother, person.mother) &&
//                Objects.equals(father, person.father) &&
//                Objects.equals(children, person.children) &&
//                Objects.equals(sisAndBro, person.sisAndBro);
    }


}
