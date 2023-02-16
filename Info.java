package Home_Work1;

import java.io.FileWriter;
import java.io.IOException;

public class Info {
    Person p;

    public Info(Person p) {
        this.p = p;
    }

    public void printInfo(){

        try {
            System.out.println(p.toString());
        }
        catch (NullPointerException e){};

        try {
            System.out.println("Mother "+p.getMother().toString());
        }
        catch (NullPointerException e){}

        try {
            System.out.println("Father "+p.getFather().toString());
        }
        catch (NullPointerException e){}

        try {
            System.out.println("Grandmother "+p.getMother().getMother().toString());
        }
        catch (NullPointerException e){}

        try {
            System.out.println("Grandmother "+p.getFather().getMother().toString());
        }
        catch (NullPointerException e){}

        try {
            System.out.println("Grandfather "+p.getFather().getFather().toString());
        }
        catch (NullPointerException e){}

        try {
            System.out.println("Grandfather "+p.getMother().getFather().toString());
        }
        catch (NullPointerException e){}


        System.out.println("Children:");
        for (Person p : p.getChildren()){
            System.out.println(p.toString());
        }
        System.out.println("Sisters and Brothers:");
        for (Person p : p.getSisAndBro()){
            System.out.println(p.toString());
        }

    }

    public void toFile(){
        try {
            FileWriter writer = new FileWriter("File.txt", true);
            writer.write(p.toString());
            writer.write("\nMother "+p.getMother().toString());
            writer.write("\nFather "+p.getFather().toString());
            writer.write("\nGrandmother "+p.getMother().getMother().toString());
            writer.write("\nGrandmother "+p.getFather().getMother().toString());
            writer.write("\nGrandfather "+p.getFather().getFather().toString());
            writer.write("\nGrandfather "+p.getMother().getFather().toString());

            writer.write("\nChildren:");
            for (Person p : p.getChildren()){
                writer.write("\n"+p.toString());
            }
            writer.write("\nSisters and Brothers:");
            for (Person p : p.getSisAndBro()){
                writer.write("\n"+p.toString());
            }
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
