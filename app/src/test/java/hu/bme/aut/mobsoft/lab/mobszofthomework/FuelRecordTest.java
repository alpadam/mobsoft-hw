package hu.bme.aut.mobsoft.lab.mobszofthomework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.robolectric.annotation.Config;

import java.util.List;

import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main.MainPresenter;
import hu.bme.aut.mobsoft.lab.mobszofthomework.ui.main.MainScreen;

import static hu.bme.aut.mobsoft.lab.mobszofthomework.TestHelper.setTestInjector;
import static org.mockito.Mockito.mock;

@RunWith(RobolectricDaggerTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class FuelRecordTest {

    private MainPresenter mianPresenter;

    @Before
    public void setup() throws Exception {
        setTestInjector();
        mianPresenter = new MainPresenter();
    }

    @Test
    public void testTodo() {
       /* MainScreen mainScreen = mock(MainScreen.class);
        mianPresenter.attachScreen(mainScreen);
        mianPresenter.getFavourites();

        ArgumentCaptor<String> todosCaptor = ArgumentCaptor.forClass(String.class);
        verify(mainScreen, times(2)).showMessage(todosCaptor.capture());

        List<String> capturedTodos = todosCaptor.getAllValues();
        assertEquals("todo one", capturedTodos.get(0));
        assertEquals("todo two", capturedTodos.get(1));*/
    }

    @After
    public void tearDown() {
        mianPresenter.detachScreen();
    }

}
