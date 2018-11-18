public class FlightManager {

    private double singleBagWeight;
    private double reservedWeight;

    public FlightManager() {
        singleBagWeight = 10; // Hardcoded 10kg weight per bag
    }

    public double calcTotalWeight(Flight flight) {
        return flight.totalBags() * this.singleBagWeight;
    }

    public double remainingBaggageCapacity(Flight flight) {
        reservedWeight = (flight.getPlane().getWeight()/2);
        return reservedWeight - this.calcTotalWeight(flight);
    }

    public double reservedWeightPerPassenger(Flight flight){
        reservedWeight = flight.getPlane().getWeight()/2;
        return reservedWeight / flight.getNumPassengers();
    }
}
