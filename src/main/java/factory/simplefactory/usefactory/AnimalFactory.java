package factory.simplefactory.usefactory;

import factory.simplefactory.entity.Animal;
import factory.simplefactory.entity.Cat;
import factory.simplefactory.entity.Dog;

public class AnimalFactory {
    Animal animal = null;
    public Animal getAnimal(String name){
        Animal animal = null;
        if(name == "dog"){
            animal = new Dog();
        }else if(name == "cat"){
            animal =  new Cat();
        }
        return animal;
    }
}
