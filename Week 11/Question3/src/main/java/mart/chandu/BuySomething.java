package mart.chandu;
public class BuySomething implements Bike, Scooty {
    @Override
    public void offer() {
        System.out.println("Exclusive Offer: Get upto ₹5000 off on your purchase!");
    }
    @Override
    public void details() {
        Bike.super.details();
        Scooty.super.details();
        System.out.println("BuySomething: Compare both and choose what fits you best!");
    }
}

