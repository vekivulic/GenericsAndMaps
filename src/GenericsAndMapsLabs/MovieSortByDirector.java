/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsAndMapsLabs;


import java.util.Comparator;

/**
 *
 * @author vekivulic
 */
public class MovieSortByDirector implements Comparator<Movie>{
  

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getDirector().compareTo(o2.getDirector());
    }

 
}
