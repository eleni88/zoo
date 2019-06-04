
package zoomain;

import Animals.Animal;
import java.util.List;

/**
 *
 * @author Eleni
 */
public class Crocodile extends Animal{
    
   public void printVariables(){
       System.out.println("name is "+ name);
       System.out.println("age is "+ age);
       System.out.println("cage is "+ cage);
   }
   @Override
   public void play(){
       System.out.println("Crocodile is playing");
   }
   @Override
   public String toString(){
   return "Croco name , age";
   }

    public Crocodile() {
    }

    public Crocodile(String name, int age) {
        super(name, age);
    }
    
    /**
     *
     * @param animals
     * @param crocos
     * @return
     */
   @Override
    public Crocodile getOldestaAimal(List<Animal> animals) {
        Crocodile max = (Crocodile)animals.get(0);
        for (Animal a : animals) {
            if (a.getAge() > max.getAge()) {
                max = (Crocodile)a;
            }

        }
        return max;
    }
   
}
