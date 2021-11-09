import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class TestPrototype {

    @Test
    public void TestCloneDeveloper(){
        EmployeeCache.loadCache();
        Employee d = EmployeeCache.getEmployee("developer");
        assertThat(d, instanceOf(Developer.class));
    }

    @Test
    public void TestCloneManager(){
        EmployeeCache.loadCache();
        Employee manager = EmployeeCache.getEmployee("manager");
        assertThat(manager, instanceOf(Manager.class));
    }

}
