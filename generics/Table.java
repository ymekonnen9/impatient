package generics;

import java.util.ArrayList;

public class Table<K, V> {
  private ArrayList<Entry<K,V>> elements;
  
  public Table(){
    this.elements = new ArrayList<>();
  }

  @SuppressWarnings("hiding")
  public class Entry<K,V>{
    private K k;
    private V v;
    public Entry(K k, V v){
        this.k = k;
        this.v = v;
    }
  }

  public V getValue(K k){
    for (Entry<K,V> entry : elements) {
      if(entry.k == k){
        return entry.v;
      }
    }
    return null;
  }

  public void addKeyValue(K k, V v){
    boolean exists = false;
  
      for(int i = 0; i< elements.size(); i++){
        if(elements.get(i).k == k){
          elements.get(i).v = v;
          exists = true;
        }
      }
     
      if(!exists){
        elements.add(new Entry<K,V>(k, v));
      }
    
  }

  public K removeKey(K k){
      for(int i = 0; i< elements.size(); i++){
        if(elements.get(i).k == k){
          elements.set(i, new Entry<K, V>(null, elements.get(i).v));
        }
      }
      return k;
  }


}
