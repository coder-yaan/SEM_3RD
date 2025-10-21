package mart.chandu;
public interface Bike {
    void offer();
    default void details() {
        System.out.println("Bike details: Sports design, 200cc engine.");
    }
}

