public enum PlaneType {
    BOEING847(2, 400),
    BOEING747(4, 300),
    BOEING647(3, 400);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
