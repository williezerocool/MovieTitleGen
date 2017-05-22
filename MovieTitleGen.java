/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietitlegen;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */
public class MovieTitleGen {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
   public static void main(String[] args) throws Exception
	{

		String[] adjectives = arrayFromUrl("http://cs.leanderisd.org/txt/adjectives.txt");
		String[] nouns      = arrayFromUrl("http://cs.leanderisd.org/txt/nouns.txt");

		System.out.println("Mitchell's Random Movie Title Generator\n");

		System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
		System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");

		String adjective = "Cool";
		String noun = "Mitchell";

		System.out.println( "Your movie title is: " + adjective + " " + noun );
	}

    
	/**
	*	@param url - the URL to read words from
	*	@return An array of words, initialized from the given URL
     * @throws java.lang.Exception
	*/	
	public static String[] arrayFromUrl( String url ) throws Exception
	{
            String[] words;
       
           try (Scanner fin = new Scanner((new URL(url)).openStream())) {
           int count = fin.nextInt();
           words = new String[count];
           for ( int i=0; i<words.length; i++ )
           {
               words[i] = fin.next();
           }
       }

		return words;
	}

}