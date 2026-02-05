package src.TUT3;
    public class Employee_test {
        public static void main(String[] args) {

            Employee e1 = new Employee(1, "John", "Doe", 3000);

            // In thông tin ban đầu
            System.out.println(e1);

            System.out.println("ID: " + e1.getId());
            System.out.println("First name: " + e1.getFirstName());
            System.out.println("Last name: " + e1.getLastName());
            System.out.println("Employee name: "+e1.getName());
            System.out.println("Salary: " + e1.getSalary());
            e1.setSalary(4000);
            System.out.println(e1);

            // Test lương năm
            System.out.println("Annual salary: " + e1.getAnnualSalary());

            // Test tăng lương 10%
            System.out.println("After raise salary 10%: "+e1.raiseSalary(10));
        }
    }


