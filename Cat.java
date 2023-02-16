package Home_Work1;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void callTheCat(Human h, String str){
        if (h.voice(str).equals("kis-kis")){
            System.out.println("mmmmrrrrrrrrr");
        }
    }
}
