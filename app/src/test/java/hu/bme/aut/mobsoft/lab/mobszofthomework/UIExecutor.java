package hu.bme.aut.mobsoft.lab.mobszofthomework;

import android.os.Looper;
import android.support.annotation.NonNull;
import android.os.Handler;
import java.util.concurrent.Executor;

public class UIExecutor implements Executor {

    private Handler mHandler;

    public UIExecutor() {
        mHandler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void execute(@NonNull Runnable command) {
        mHandler.post(command);
    }
}
