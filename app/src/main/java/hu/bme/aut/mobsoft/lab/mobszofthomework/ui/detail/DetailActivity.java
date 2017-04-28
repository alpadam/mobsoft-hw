package hu.bme.aut.mobsoft.lab.mobszofthomework.ui.detail;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import hu.bme.aut.mobsoft.lab.mobszofthomework.MainApplication;
import hu.bme.aut.mobsoft.lab.mobszofthomework.R;
import hu.bme.aut.mobsoft.lab.mobszofthomework.model.FuelRecord;

import static hu.bme.aut.mobsoft.lab.mobszofthomework.repository.MemoryRepository.records;

public class DetailActivity extends AppCompatActivity implements DetailScreen {

    @Inject
    DetailPresenter detailPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainApplication.injector.inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        detailPresenter.attachScreen(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        detailPresenter.detachScreen();
    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDetail(FuelRecord record){

    }
}
