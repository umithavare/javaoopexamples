public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYears;

    Employee(String name, double salary, int workHours, int hireYears) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    double tax(){
        double salaryTax = 0;
        if (this.salary > 1000) {
            salaryTax = this.salary * 0.03;
        } else if (this.salary < 1000) {
            salaryTax = 0;
        }
        return salaryTax;
    }

    double bonus(){
        double salaryBonus = 0;
        if (this.workHours > 40){
            salaryBonus = (40 - this.workHours) * 30;
        }
        return salaryBonus;
    }

    double raiseSalary(){
        double raiseMoney = 0;
        if (this.hireYears < 10){
            raiseMoney = this.salary * 0.05;
        }
        else if ((this.hireYears > 9) && (this.hireYears < 20)){
            raiseMoney = this.salary * 0.1;
        }
        else if (this.salary > 19){
            raiseMoney = this.salary * 0.15;
        }
        return raiseMoney;

    }

    void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Years: " + this.hireYears);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary raise: " + raiseSalary());
        System.out.println("Salary including bonus and taxes: " + (this.salary + bonus() - tax()));
        System.out.println("Total salary: " + (this.salary + raiseSalary() + bonus() - tax()));
    }

}
