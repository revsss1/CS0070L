public class Salary extends Employee {
    private String name;
    private double basic;
    private double overtime;
    private double total;

    Salary(String company, char category, String name, double basic, double overtime) {
        super(company, category);
        this.name = name;
        this.basic = basic;
        this.overtime = basic * overtime;
        this.total = calculateTotal(basic, overtime);
    }

    double calculateTotal(double basic, double overtime) {
        return basic + this.overtime;
    }

    // getters
    String getName() {
        return name;
    }

    double getbasic() {
        return basic;
    }

    public double getOvertime() {
        return overtime;
    }

    public double getTotal() {
        return total;
    }

}