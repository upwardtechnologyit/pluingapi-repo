package it.upwardtechnology.gestionale.plugin;

public final class PluginApi {
    public static final String VERSION = "1.1.1";
    public static final int MAJOR_VERSION = 1;
    public static final int MINOR_VERSION = 1;
    public static final int PATCH_VERSION = 1;

    private PluginApi() {}

    public static boolean isCompatibleMajor(int requiredMajor) {
        return requiredMajor == MAJOR_VERSION;
    }

    public static boolean isCompatible(int requiredMajor, int minimumMinor) {
        return requiredMajor == MAJOR_VERSION && minimumMinor <= MINOR_VERSION;
    }
}
