import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

public class TestAbstractFactory {

    @Test
    public void TestJapaneese() {
        Client client = new Client(GardenType.JAPANESE);
        client.createGarden();
        assertThat(client.getTree(), instanceOf(JapTree.class));
        assertThat(client.getFlower(), instanceOf(JapFlower.class));
    }

    @Test
    public void TestIranian() {
        Client client = new Client(GardenType.IRANIAN);
        client.createGarden();
        assertThat(client.getTree(), instanceOf(Chenar.class));
        assertThat(client.getFlower(), instanceOf(Khatmi.class));
    }

    @Test
    public void TestNull() {
        Client client = new Client(GardenType.FRENCH);
        client.createGarden();
        assertNull(client.getTree());
        assertNull(client.getFlower());
    }
}
