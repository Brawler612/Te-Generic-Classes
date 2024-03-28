import java.util.ArrayList;

public class MyMap<Key, Value> {
    private ArrayList<Key> keys;
    private ArrayList<Value> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(Key key, Value value) {
        int index = keys.indexOf(key);
        if (index == -1) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(index, value);
        }
    }

    public Value get(Key key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            return values.get(index);
        }
        return null;
    }

    public Value remove(Key key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            keys.remove(index);
            return values.remove(index);
        }
        return null;
    }
}