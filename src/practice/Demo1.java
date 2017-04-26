
package practice;

import common.Employee;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author vekivulic
 */
public class Demo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //HashMap most common, HashTable, TreeMap, LinkedHashMap
        // Non generic version 
        Map myMap= new HashMap();
        myMap.put(1, "January");
        myMap.put(2, "February");
        myMap.put(3, "March");
         
        String m= (String)myMap.get(1);
         System.out.println(m);
         //prints out January 
    
    // it can be written  both ways
     Map myMap1= new HashMap();
        myMap1.put("January", 1);
        myMap1.put("February", 2);
        myMap1.put("March", 3);
        
        Integer v= (Integer)myMap1.get("March");
        System.out.println(v);
        //prints out number 1
    
        
        Employee e1 = new Employee(1,"Doe", "John", "333-33-3333");
        Employee e2 = new Employee(2,"Smith", "Sally", "111-11-1111");
        Employee e3 = new Employee(3,"Jones","Bob", "444-44-4444");
        
         Map myMap2= new HashMap();
        myMap2.put("333-33-3333", e1);
        myMap2.put("111-11-1111", e2);
        myMap2.put("444-44-4444", e3);
        
//      Employee l= (Employee)myMap2.get("111-11-1111");
//        System.out.println(l);
        
        
        Collection empCol=myMap2.values();
        for (Object empObj: empCol){
            Employee e= (Employee)empObj;
            System.out.println(e);
        }
        
        Set keys=myMap2.keySet();
        // you cant have duplicates 
        
        for(Object key: keys){
            Employee e=(Employee)myMap2.get(key);
            System.out.println(e);
        }
        // GENERIC MAPS 
         Map <String, Employee>myMap3= new HashMap<>();
        myMap2.put("333-33-3333", e1);
        myMap2.put("111-11-1111", e2);
        myMap2.put("444-44-4444", e3);
        
        Integer size=myMap.size();
        System.out.println(size);
        
//      Employee l= (Employee)myMap2.get("111-11-1111");
//        System.out.println(l);
        
        
        Collection <Employee>empCol1=myMap3.values();
        for (Employee empObj: empCol1){
            Employee eE= empObj;
            System.out.println(eE);
        }
                Set keyys=myMap3.keySet();
        // you cant have duplicates 
        
        for(Object keyy: keyys){
            Employee e=myMap3.get(keyy);
            System.out.println(e);
        }
}
}