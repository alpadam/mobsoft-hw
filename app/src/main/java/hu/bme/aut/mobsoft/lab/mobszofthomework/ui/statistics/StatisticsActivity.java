package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.statistics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.MainApplication;
import hu.bme.aut.mobsoft.lab.mobszofthomework.R;
import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;

public class StatisticsActivity extends AppCompatActivity implements StatisticsScreen {
    @Inject
    StatisticsPresenter statisticsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        statisticsPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        statisticsPresenter.detachScreen();
    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showStatistics(List<FuelRecord> records) {

    }
}
