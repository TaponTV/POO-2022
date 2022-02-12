package mx.uv.fiee.iinf.poo.demos.generictupla;

public class GenericTupla<K, V> {

    private final K key;
    private final V value;

    public GenericTupla (K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey () {
        return key;
    }

    public V getValue () {
        return value;
    }

    @Override
    public String toString () {
        return String.format ("(%s, %s)", key.toString (), value.toString ());
    }

    @Override
    public boolean equals (Object obj) {
        if (!(obj instanceof GenericTupla)) return false;
        GenericTupla<K, V> two = (GenericTupla<K, V>) obj;
        return this.key.equals (two.key) && this.value.equals (two.value);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
