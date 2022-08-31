import org.json.simple.JSONArray;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.BaseHelper;

import java.util.List;


public class RCBTeamTest extends BaseHelper {

    String testFileName = "src/main/java/data/rcb.json";
    JSONArray rcbPlayerData = new JSONArray();

    @BeforeTest
    public void getTestData() {
        rcbPlayerData = readTestData(testFileName);
    }

    @Test
    public void validateForeignPlayerCount() {
        List countryList = getPlayerAttribute(rcbPlayerData, "country");
        System.out.println(countryList);
    }

}
