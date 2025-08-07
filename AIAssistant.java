public class AIAssistant {

    // Member variables
    String name;
    String version;
    String purpose;
    double accuracy;

    // Member method to display AI details
    void displayAIDetails() {
        System.out.println("AI Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Purpose: " + purpose);
        System.out.println("Accuracy: " + accuracy + "%");
    }

    // Member method to simulate AI task
    void performTask() {
        System.out.println(name + " is analyzing data and providing intelligent insights...");
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of AIAssistant
        AIAssistant ai1 = new AIAssistant();

        // Assigning values
        ai1.name = "NeuraX";
        ai1.version = "2.5";
        ai1.purpose = "Medical Diagnosis Support";
        ai1.accuracy = 92.7;

        // Calling methods
        ai1.displayAIDetails();
        ai1.performTask();
    }
}
