package org.rock.paper.scissors.mock;

import java.util.HashMap;
import java.util.Map;

public final class MockBuilder {

    private static final Map<String, String> mockSelection = new HashMap<>(3);
    private static MockBuilder mMockBuilder;

    private MockBuilder() {
    }

    public static String containsGet(String key, String defaultValue) {
        if (mockSelection.containsKey(key)) {
            return mockSelection.get(key);
        }

        return defaultValue;
    }

    public static boolean contains(String key) {
        return mockSelection.containsKey(key);
    }

    public static void setMockSelection(String key, String value) {
        mockSelection.put(key, value);
    }
}
