package Home_Work1;

public class Main {
    public static void main(String[] args) {

        Person grandMotherM = new Person("Алевтина", 60);
        Person grandFatherM = new Person("Иван", 63);
        Person grandMotherF = new Person("Клара", 60);
        Person grandFatherF = new Person("Иннокентий", 63);
        Person mother = new Person("Ольга", 30, grandMotherM, grandFatherM);
        Person father = new Person("Сергей", 35, grandMotherF, grandFatherF);
        Person son = new Person("Антон", 15, mother, father);
        Person son2 = new Person("Андрей", 14);
        son2.setFather(father);
        son2.setMother(mother);

        Info person1 = new Info(father);
        Info son1 = new Info(son);
        person1.printInfo();
        System.out.println("------------------------");
        son1.printInfo();
        son1.toFile();

        System.out.println("------------------------");
        Closet closet = new Closet();
        Human human = new Human("Bob");
        closet.toInteractCloset(human);
        if (closet.getState() == Closet.State.Open){
            System.out.println("Bob opened the closet");
        }
        if (closet.getState() == Closet.State.Close){
            System.out.println("Bob closed the closet");
        }

        System.out.println("------------------------");
        Cat cat = new Cat("Barsik");
        cat.callTheCat(human, "kis-kis");



    }
}
