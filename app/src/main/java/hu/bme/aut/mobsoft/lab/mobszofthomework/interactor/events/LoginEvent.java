package hu.bme.aut.mobsoft.lab.mobszofthomework.interactor.events;

public class LoginEvent {
    private boolean success;
    private Throwable throwable;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public LoginEvent() {
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
