package Balaji;

import java.util.Optional;

public class SimpleCache<T>  {
	
	private T obj;
	private long storageTime;
	private final long ttl;
	
	public SimpleCache(long ttl) {
		this.ttl = ttl;
	}
	
	public Optional <T> get(){
		if (this.obj == null) {
			Optional.empty();
		}
		final long now = System.currentTimeMillis();
		if (now - this.storageTime > this.ttl)
		{
			this.obj = null;
			this.storageTime = 0;
			return Optional.empty();
		}
		return Optional.of(this.obj);
	}
	
	public void set (T obj) {
			this.obj = obj;
			this.storageTime = System.currentTimeMillis();
	} 
	
	public static void main(String[] args) {
		SimpleCache<String> cache = new SimpleCache<>(1000 * 10);
		System.out.println(cache.get().isPresent());
		System.out.println("Cache contains something : " + cache.get());
		cache.set("Balaji Narasimhan writing cache");
		System.out.println("Cache contains something : " + cache.get());
		System.out.println("Cache contains something : " + cache.get());
		System.out.println(cache.get().isPresent());
	}
}
