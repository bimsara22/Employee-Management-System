public interface EmployeeDaoInterface {


    public void createEmployee(Employee emp);
    public void showEmployee();
    public void showEmployeeBasedOnID(int id);
    public void updateEmployee(int id,String name);
    public void deleteEmployee(int id);


    void deleteEmployee();
}
