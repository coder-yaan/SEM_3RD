package gordon.foodstore;
class Edible {
    static class Fruit {
        static void fruitDetails() {
            System.out.println("Fruit: Apple, Color: Red, Weight: 200g");
        }
        void fruitPackaging() {
            System.out.println("Packing the fruit in a basket");
        }
    }

    static class Vegetable {
        static void vegetableDetails() {
            System.out.println("Vegetable: Carrot, Color: Orange, Weight: 150g");
        }
        void vegetablePackaging() {
            System.out.println("Packing the vegetable in a crate");
        }
    }
}
