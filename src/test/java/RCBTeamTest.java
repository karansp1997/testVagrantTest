import org.json.simple.JSONArray;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.BaseHelper;

import java.util.List;


public class RCBTeamTest extends BaseHelper {

    String testFileName = "src/main/java/data/rcb.json";
    String testKey = "player";
    JSONArray rcbPlayerData = new JSONArray();

    @BeforeTest
    public void getTestData() {
        rcbPlayerData = readTestData(testFileName, testKey);
    }

    @Test
    public void validateForeignPlayerCount() {
        List countryList = getPlayerAttribute(rcbPlayerData, "country");
        assert(getForeignPlayerCount(countryList) == 4);
    }

    @Test
    public void validateWicketKeeperPresentInSquad() {
        List playerRoleList = getPlayerAttribute(rcbPlayerData, "role");
        assert(getWicketKeeperCount(playerRoleList)>=1);
    }

}
