public class Worker {

    protected String name;
    protected String surname;
    protected double hourlyRate;

    public Worker(String name, String surname, double hourlywage) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlywage;
    }

    public double calculateSalary(double workedhours) {
        return workedhours * hourlyRate;
    }



}
