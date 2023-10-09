public class Employee {

    private String company;
    private char category;

    Employee(String company, char category) {
        this.company = company;
        this.category = category;
    }

    void printEmployeeDetails() {
        System.out.println("company: " + company);
        System.out.println("category: " + category);
    }

    public char getCategory() {
        return category;
    }

    public String getCompany() {
        return company;
    }
}