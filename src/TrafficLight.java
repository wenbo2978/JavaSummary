public enum TrafficLight {
    RED("Red", 30),
    GREEN("Green", 45),
    YELLOW("Yellow", 5),
    BLUE("Blue", 5);

    private final String color;
    private final int duration; // duration in seconds

    // Constructor
    TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to get the color of the traffic light
    public String getColor() {
        return color;
    }

    // Method to get the duration of the traffic light
    public int getDuration() {
        return duration;
    }

    // Display information about the traffic light
    public void displayInfo() {
        System.out.println("The " + color + " light lasts for " + duration + " seconds.");
    }

    // Main method to test the enum
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            light.displayInfo();
        }
    }
}
