package gordon.foodstore;
public class Main {
    public static void main(String[] args) {
        Edible.Fruit.fruitDetails();
        Edible.Vegetable.vegetableDetails();
        Edible.Fruit apple = new Edible.Fruit();
        apple.fruitPackaging();
        Edible.Vegetable carrot = new Edible.Vegetable();
        carrot.vegetablePackaging();
    }
}