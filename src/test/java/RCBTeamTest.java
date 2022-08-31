import org.json.simple.JSONArray;
import org.testng.annotations.BeforeTest;
import util.BaseHelper;


public class RCBTeamTest extends BaseHelper {

    String testFileName = "src/main/java/data/rcb.json";
    JSONArray rcbPlayerData = new JSONArray();

    @BeforeTest
    public void getTestData() {
        rcbPlayerData = readTestData(testFileName);
    }

}
