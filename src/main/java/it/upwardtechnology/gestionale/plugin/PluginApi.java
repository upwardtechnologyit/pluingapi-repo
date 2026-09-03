package it.upwardtechnology.gestionale.plugin;

/** Version and compatibility rules for the public Upward Plugin API. */
public final class PluginApi {
    public static final String VERSION = "1.0.0";
    public static final int MAJOR_VERSION = 1;
    public static final int MINOR_VERSION = 0;
    public static final int PATCH_VERSION = 0;

    private PluginApi() {}

    public static boolean isCompatibleMajor(int requiredMajor) {
        return requiredMajor == MAJOR_VERSION;
    }

    public static boolean isCompatible(int requiredMajor, int minimumMinor) {
        return requiredMajor == MAJOR_VERSION && MINOR_VERSION >= minimumMinor;
    }
}
