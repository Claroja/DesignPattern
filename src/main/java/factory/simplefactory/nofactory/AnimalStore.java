package factory.simplefactory.nofactory;

import factory.simplefactory.entity.Animal;
import factory.simplefactory.entity.Cat;
import factory.simplefactory.entity.Dog;

public class AnimalStore {
    public Animal getAnimal(String name){
        Animal animal = null;
        if(name == "dog"){
            animal = new Dog();
        }else if(name == "cat"){
            animal =  new Cat();
        }
        return animal;
    }

    public static void main(String[] args) {
        AnimalStore store = new AnimalStore();
        store.getAnimal("cat").say();
    }
}
