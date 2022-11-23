package testSuite;

import client.pet.PetClient;
import org.testng.annotations.BeforeClass;

public class PetTest extends BaseTest {
    private PetClient petClient;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        this.petClient = new PetClient();
    }


}
