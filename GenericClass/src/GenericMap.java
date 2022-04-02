
public class GenericMap<K, V> {

	private K key;
	private V value;
	GenericMap(K key,V value){
		super();
		this.key=key;
		this.value=value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	
}
