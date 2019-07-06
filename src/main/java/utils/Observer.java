package utils;

import java.util.Map;

public interface Observer {
    void notify(String change, Object source);

    void notify(String change, Map<String, Double> source);
}
