import org.testng.annotations.Test;

public class LocationSaveTest extends driverFactory {
    LocationSavePage locationSavePage;

    @Test
    public void testLocationAndCategories() throws InterruptedException {
        locationSavePage = new LocationSavePage(driver);
        locationSavePage.locationSave();
    }
}
