package io.primeval.aspecio.internal.weaving.shared;

import java.lang.reflect.Method;

// Class meant to be used *from* the woven classes.
public final class WovenUtils {

    private WovenUtils() {
    }

    public static Method getMethodUnchecked(Class<?> clazz, String methodName, Class<?>... params) {
        try {
            return clazz.getMethod(methodName, params);
        } catch (NoSuchMethodException | SecurityException e) {
            throw new AssertionError("Inconsistent weaving");
        }
    }

}
