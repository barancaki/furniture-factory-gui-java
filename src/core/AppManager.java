package core;

public class AppManager {
    private static AppManager instance;

    private AppManager() {
        // private constructor
    }

    public static AppManager getInstance() {
        if (instance == null) {
            instance = new AppManager();
        }
        return instance;
    }

    // Global state burada tutulabilir (örneğin seçili fabrika)
}
