package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.listpage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.MainApplication;
import hu.bme.aut.mobsoft.lab.mobszofthomework.R;
import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;

public class ListPageActivity extends AppCompatActivity implements ListPageScreen {

    @Inject
    ListPagePresenter listPagePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        listPagePresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        listPagePresenter.detachScreen();
    }

    @Override
    public void showRecordList(List<FuelRecord> records){

    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
