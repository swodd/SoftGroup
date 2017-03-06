import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Dima on 06.03.2017.
 */


public class CacheMap extends LinkedHashMap<String, Integer> {
    public static final int MAX_SIZE = 3;

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
        return size() > MAX_SIZE;
    }
}
