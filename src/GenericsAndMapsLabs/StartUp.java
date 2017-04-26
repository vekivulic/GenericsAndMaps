
package GenericsAndMapsLabs;

import common.Employee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author vekivulic
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Movie movie1=new Movie("The Shawshank Redemption", "Frank Darabont", "A1111");
        Movie movie2= new Movie ("Mystic River ", "Clint Eastwood", "A2222");
        Movie movie3= new Movie ("The Town", "Ben Affleck", "A3333");
        Movie movie4=new Movie("The Shawshank Redemption", "Frank Darabont", "A1111");
     
    //LAB #2
        Map<String,Movie> myMovieMap= new HashMap<>();
        myMovieMap.put("The Shawshank Redemption", movie1);
        myMovieMap.put("Mystic River", movie2);
        myMovieMap.put("The Town", movie3);
        myMovieMap.put("The Shawshank Redemption", movie4);
        
        //retrieve individual items
        Movie m = (Movie)myMovieMap.get("The Town");
        System.out.println("\nRetrieving individual movie: The Town: " + m);
        
       //movies without duplicates 
        System.out.println("\nList of movies without duplicates: ");
        Set <String> keys = myMovieMap.keySet();
        for(String s : keys) {
            System.out.println(s);
        }
        
   
        
     //LAB #3
     //Store the same four Movie objects in a TreeMap
     System.out.println("\nSorted Collections List:");
        Map<String,Movie> sortedByKeys = new TreeMap<>(myMovieMap);
        Set<String>keys2 = sortedByKeys.keySet();
         for (String s : keys2) {
           System.out.println(s);
        }
        
        // Collections sort emthod using list, allows duplicates and sorts by default
        System.out.println("\nCollections sorted by keys: ");
        Collection <Movie> movieCol = sortedByKeys.values();
        List<Movie> list = new ArrayList<>(movieCol);
        

        Collections.sort(list);
        for (Movie mmmm : list) {
            System.out.println(mmmm);
        }
        // LAB 4
        //using a Comparator sort order for the Movie objects and sort by director
      

        System.out.println("\nComparator created used to sort by director: ");
        Collections.sort(list, new MovieSortByDirector());
        for (Movie m2 : list) {
            System.out.println(m2);
        }

        //LAB 5
        //Movie objects in a TreeSet
      
        Set<Movie> movieSet = new TreeSet<>(movieCol);
//        movieSet.add(movie3);
//        movieSet.add(movie2);
//        movieSet.add(movie1);
//        movieSet.add(movie4);

        //duplicates are removed by looping through the set and 
        //outputting the toString() value to the console.
        System.out.println("\nDuplicates are removed: ");
        for (Movie mmmm : movieSet) {
            System.out.println(mmmm.toString());
        }

    }
}
