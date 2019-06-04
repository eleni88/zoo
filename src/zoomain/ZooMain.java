package zoomain;

import Animals.Animal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eleni
 */
public class ZooMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Crocodile croco = new Crocodile();
        croco.eat();
        croco.play();
        System.out.println(croco);
//      Zebra zebra = new Zebra();
//      zebra.play();
//      
//      Lion lion = new Lion();
//      lion.move();
        Animal lion = new Lion();
        System.out.println(lion);

        Animal a1 = new Animal("Doggy", 13);
        Animal a2 = new Animal("Doggy", 18);
        Animal a3 = new Animal("Doggy", 15);
        List<Animal> animals = new ArrayList();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        
        Animal tempAnimal = Animal.getOldestaAimal(animals);//την getOldestaAimal την 
        //κάναμε static στο class Animals κι έτσι μπορούμε εδώ να την 
       //καλέσουμε με το όνομα της κλάσης Animal.

           System.out.println(tempAnimal);
    
        Crocodile croco1 = new Crocodile("Doggy", 13);
        Crocodile croco2 = new Crocodile();
        Crocodile croco3 = new Crocodile();
        List<Crocodile> crocos = new ArrayList();
        crocos.add(croco1);
        crocos.add(croco2);
        crocos.add(croco3);
        Crocodile tempCrocodile = Animal.getOldestaCrocodile(crocos);
        System.out.println("Oldest croco is "+tempCrocodile);
    
    
        
    }
    
}
