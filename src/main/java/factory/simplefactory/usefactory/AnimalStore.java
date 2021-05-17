package factory.simplefactory.usefactory;

public class AnimalStore {
    AnimalFactory factory = new AnimalFactory();

    public static void main(String[] args) {
        AnimalStore store = new AnimalStore();
        store.factory.getAnimal("cat").say();
    }
}
