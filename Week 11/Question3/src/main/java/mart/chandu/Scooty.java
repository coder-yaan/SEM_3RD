package mart.chandu;
public interface Scooty {
    void offer();
    default void details() {
        System.out.println("Scooty details: Lightweight, 110cc engine.");
    }
}