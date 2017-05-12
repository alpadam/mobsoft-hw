package hu.bme.aut.mobsoft.lab.mobszofthomework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.robolectric.annotation.Config;

import java.util.List;

import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage.ListPageScreen;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main.MainPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage.ListPagePresenter;
import static org.junit.Assert.assertEquals;

import static hu.bme.aut.mobsoft.lab.mobszofthomework.TestHelper.setTestInjector;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@RunWith(RobolectricDaggerTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class FuelRecordTest {

    private MainPresenter mainPresenter;
    private ListPagePresenter listPagePresenter;



    @Before
    public void setup() throws Exception {
        /*setTestInjector();
        mainPresenter = new MainPresenter();
        listPagePresenter = new ListPagePresenter();*/
    }

    @Test
    public void testListPage() {

        /*ListPageScreen listPageScreen = mock(ListPageScreen.class);
        listPagePresenter.attachScreen(listPageScreen);
        listPagePresenter.getFuelRecords();

        ArgumentCaptor<String> fuelRecordsCaptor = ArgumentCaptor.forClass(String.class);
        verify(listPageScreen, times(2)).showMessage(fuelRecordsCaptor.capture());

        List<String> capturedFuelRecords = fuelRecordsCaptor.getAllValues();
        assertEquals("todo one", capturedFuelRecords.get(0));
        assertEquals("todo two", capturedFuelRecords.get(1));*/
    }

    @After
    public void tearDown() {
        /*mainPresenter.detachScreen();*/
    }

}
