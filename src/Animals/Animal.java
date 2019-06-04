package Animals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eleni
 */
public class Animal {

    protected String name;
    protected int age;
    protected String cage;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String cage) {
        this(name, age);

        this.cage = cage;
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

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + "age=" + age + "cage=" + cage + '}';
    }

    public void move() {
        System.out.println("animal is moving");
    }

    public void play() {
        System.out.println("animal is playing");
    }

    public void eat() {
        System.out.println("animal is eating");
    }

    public  Animal getOldestaAimal(List<Animal> animals) {
        Animal max = animals.get(0);
        for (Animal a : animals) {
            if (a.getAge() > max.getAge()) {
                max = a;
            }

        }
        return max;
    }
    
    public  Animal getOldestaCrocodile(List<Crocodile> crocos) {
        Crocodile max = crocos.get(0);
        for (Crocodile a : crocos) {
            if (a.getAge() > max.getAge()) {
                max = a;
            }

        }
        return max;
    }
    
     
}
