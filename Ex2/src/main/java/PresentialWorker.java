public class PresentialWorker extends Worker{

    private static double petrol;

    public PresentialWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(double hoursWorked) {
        return super.calculateSalary(hoursWorked) + petrol;
    }

    @Deprecated

    public void  clockInWithPunchCard() {
        System.out.println("Clocked in using punch card system");
    }


}
