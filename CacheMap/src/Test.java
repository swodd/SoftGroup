/**
 * Created by Dima on 06.03.2017.
 */
public class Test{
    public static void main(String[] args) {
        CacheMap map = new CacheMap();
        map.put("1", 1 );
        map.put("2", 2 );
        map.put("3", 3 );
        map.put("4", 4 );
        map.put("5", 5 );

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}

