/**
 * ---------------------------------------------------------------------------
 * File name: ArrayOperations.java
 * Project name: Project2 - Contact
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 23, 2017
 * ---------------------------------------------------------------------------
 */

package arrayOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Array Operations
 * 
 * <hr>
 * Date created: Feb 23, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class ArrayOperations
{

	static String[] data;	/** The data. */

	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Feb 23, 2017 .
	 */
	public ArrayOperations ( )
	{
		loadFile("DesignDocs\\States for Project 2.txt");
		selectionSort(data, data.length);
	}//End ArrayOperations ( )

	/**
	 * Load file.
	 *
	 * @param path the path
	 */
	public static void loadFile (String path)
	{
		List<String> temps = new ArrayList<String>();
		String token1;			//Placeholder for state value
		Scanner inFile1 = null;	//Input from file
		try
		{
			inFile1 = new Scanner(new File(path)).useDelimiter(",\\s*");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		while (inFile1.hasNext()) {
			token1 = inFile1.next().replaceAll ("\"", "");
			temps.add(token1);
		}
		inFile1.close();
		data = temps.toArray(new String[0]);
	}//End loadFile (String)
	
	/**
	 * Find max.
	 *
	 * @param array the array
	 * @param size the size
	 * @return the int
	 */
	public static int findMax (String[] array, int size)
	{
		int max = 0;	//Placeholder for max value
		for(int i = 0 ; i < size; i++)
		{
			if (array[i].compareTo(array[max])>0)
			{
				max = i;
			}
		}
		return max;
	}//End findMax (String[], int)
	
	/**
	 * Selection sort.
	 *
	 * @param array the array
	 * @param size the size
	 */
	public static void selectionSort(String[] array, int size)
	{
		if (array.length != 0)
		{
			for(int i = size - 1 ; i > 1 ; i--)
			{
				int max = findMax(array, i);
				if(array[i].compareTo(array[max])>0)
				{
					String temp = array[max];
					array[max] = array[i-1];
					array[i-1] = temp;
				}
			}
		}
	}//End selectionSort(String[], int)

	/**
	 * Binary search.
	 *
	 * @param value the value
	 * @return the int
	 */
	public static int binarySearch(String value)
	{
		int first;      //First element
		int last;       //Last element
		int middle;     //Middle element
		int position;   //Current element
		boolean found;  //Flag
		first = 0;
		last = data.length;
		middle = 0;
		position = -1;
		found = false;

			while (!found && first <= last -1)
			{
				if (middle == data.length)
				{
					return position;
				}
				middle = (first + last) / 2;
				System.out.println("Value: " + value);
				System.out.println("Selection:" + data[middle]);
				System.out.println("Middle: " + middle + "\n\n");
				if (data[middle].compareTo(value) == 0)
				{
					found = true;
					position = middle;
				}
				else if (data[middle].compareTo(value) > 0)
				{
					last = middle - 1;
				}
				else
				{
					first = middle + 1;
				}
			}
		return position;
	}//End binarySearch(String)

	/**
	 * toString method         
	 * 
	 * <hr>
	 * Date created: Feb 24, 2017 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		String strData = "";
		for (String element : data)
		{
			strData = data[1] + "\n";
		}
		return strData;
	}//End toString ( )
	
}//End ArrayOperations
