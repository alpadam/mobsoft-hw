package hu.bme.aut.mobsoft.lab.mobszofthomework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.robolectric.annotation.Config;

import java.util.List;

import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage.ListPageScreen;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main.MainPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage.ListPagePresenter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static hu.bme.aut.mobsoft.lab.mobszofthomework.TestHelper.setTestInjector;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@RunWith(RobolectricDaggerTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class FuelRecordTest {

    private ListPagePresenter listPagePresenter;

    @Before
    public void setup() throws Exception {
        setTestInjector();
        listPagePresenter = new ListPagePresenter();
    }

    @Test
    public void testListPage() {
        ListPageScreen listPageScreen = mock(ListPageScreen.class);
        listPagePresenter.attachScreen(listPageScreen);
        listPagePresenter.getFuelRecords();

        ArgumentCaptor<List> fuelRecordsCaptor = ArgumentCaptor.forClass(List.class);
        verify(listPageScreen).showRecordList(fuelRecordsCaptor.capture());

        List<FuelRecord> capturedFuelRecords = fuelRecordsCaptor.getValue();
        assertTrue(fuelRecordsCaptor.getValue().size() > 0);
    }

    @After
    public void tearDown() {
        listPagePresenter.detachScreen();
    }
}
