public abstract class Employee implements Cloneable{

    private String id;
    private int salary;
    protected String salaryType;

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
