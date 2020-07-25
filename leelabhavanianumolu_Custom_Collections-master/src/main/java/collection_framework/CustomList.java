package collection_framework;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomList<A> {
	
	public static final Logger log=LogManager.getLogger(CustomCollectionList.class);
	private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object elementData[] = {};
 

    public CustomList() {
           elementData = new Object[INITIAL_CAPACITY];
    }
 
    public void add(A e) {
           if (size == elementData.length) {
                  increaseCapacity(); 
           }
           elementData[size++] = e;
    }
 
    
    @SuppressWarnings("unchecked")
    public A get(int index) {
           return (A) elementData[index]; 
    }
 
    
    public Object remove(int index) {
 
           Object removedElement = elementData[index];
           for (int i = index; i < size - 1; i++) {
                  elementData[i] = elementData[i + 1];
           }
           size--; 
 
           return removedElement;
    }
 
    private void increaseCapacity() {
           int newIncreasedCapacity = elementData.length * 2;
           elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }
 
    public void display() {
           log.info("Displaying list : ");
           for (int i = 0; i < size; i++) {
                  log.info(elementData[i] + ",");
           }
         log.info("\n\n");
    }

}
