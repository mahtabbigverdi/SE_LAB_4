import java.util.Hashtable;

public class EmployeeCache {
    private static Hashtable<String, Employee> employeeMap = new Hashtable<String, Employee>();

    public static Employee getEmployee(String name) {
        Employee cachedShape = employeeMap.get(name);
        return (Employee) cachedShape.clone();
    }

    public static void loadCache() {
        Developer developer = new Developer();
        employeeMap.put("developer",developer);

        Manager manager = new Manager();
        employeeMap.put("manager",manager);
    }

}
