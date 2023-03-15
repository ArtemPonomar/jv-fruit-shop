package core.basesyntax.db;

import java.util.Collection;
import java.util.Map;

public interface Dao<K,V> {
    void create(K key, V value);
    void update(K key, V value);
    V getByKey(K key);
    Collection<Map.Entry<K,V>> getAll();
    void clear();
}