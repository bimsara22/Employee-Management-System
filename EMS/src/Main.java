import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        EmployeeDaoInterface dao=new EmployeeDaoImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To EMS");

        do {
            System.out.println("1.Add Employee\n"+
                   "2.Show All Employee\n"+
                    "3.Show Employee Based On Id\n"+
                    "4.Update the Employee\n"+
                    "5.Delete the Employee");


            System.out.println("Enter the Choice\n");
            int ch= sc.nextInt();
            switch (ch){
                case 1 :
                    Employee emp=new Employee();
                    System.out.println("Enter id");
                    int id=sc.nextInt();
                    System.out.println("Enter Name");
                    String name=sc.next();
                    System.out.println("Enter Salary");
                    int salary=sc.nextInt();
                    System.out.println("Enter Age");
                    int age=sc.nextInt();

                    emp.setId(id);
                    emp.setName(name);
                    emp.setAge(age);
                    emp.setSalary(salary);

                    dao.createEmployee(emp);
                    break;


                case 2:
                    dao.showEmployee();
                    break;

                case 3:
                    System.out.println("Enter id to show the details");
                    int empid=sc.nextInt();
                    dao.showEmployeeBasedOnID(empid);
                    break;

                case 4:
                    System.out.println("Enter id to Update the Details");
                    int empid1=sc.nextInt();
                    System.out.println("Enter the New name");
                    String name1=sc.next();
                    dao.updateEmployee(empid1,name1);
                    break;

                case 5:
                    System.out.println("Enter id to Delete");
                    int id3=sc.nextInt();
                    dao.deleteEmployee(id3);

                case 6:
                    System.out.println("Thank you using application");
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice : ");
                    break;

            }
        }while (true);



















        }
    }
