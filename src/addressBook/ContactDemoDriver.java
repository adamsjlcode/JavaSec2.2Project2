/**
 * ---------------------------------------------------------------------------
 * File name: ContactDemoDriver.java
 * Project name: Project2 - Contact
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 23, 2017
 * ---------------------------------------------------------------------------
 */

package addressBook;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


/**
 * Driver for testing Contact Class
 * 
 * <hr>
 * Date created: Feb 23, 2017
 * <hr>.
 *
 * @author Justin Adams
 */
public class ContactDemoDriver
{


	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main (String [ ] args)
	{
		ArrayList<Contact> addressBook = new ArrayList<Contact>();
		//No-arg Constructor
		System.out.println ("Create Contact One (No Arg)");
		Contact one = new Contact();
		addressBook.add (one);
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(15);
		//All-arg Constructor
		System.out.println ("Create Contact All (All Arg)");
		System.out.println ("\nSearch Text File");
		clearAndStop(3);
		Contact all = new Contact("FRIEND", 
								  "John Dehart", 
								  "40726 West 3rd Ave.", 
								  "Umatilla", "FL", "32784", 
								  "3526690862", 
								  "johnDehart@gmail.com", 
								  "//Picture//johnDehart.jpg");
		clearAndStop(15);
		addressBook.add (all);
		System.out.println (addressBook.get (1).toString ( ));
		clearAndStop(15);
		//Copy Constructor
		Contact copy = new Contact(all);
		System.out.println ("Create Contact Copy (Copy of Contact(All))");
		addressBook.add (copy);
		System.out.println (addressBook.get (2).toString ( ));
		clearAndStop(15);
		//Set Type
		System.out.println ("Setting type value to Contact One (wrong)");
		addressBook.get (0).setType ("wrong");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println ("Setting type value to Contact One (FAMILY)");
		addressBook.get (0).setType ("FAMILY");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		//Set Name
		System.out.println ("Setting name value to Contact One (Justi2n Adams)");
		addressBook.get (0).setName ("Justi2n Adams");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println ("Setting name value to Contact One (Justin Adams)");
		addressBook.get (0).setName ("Justin Adams");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		//Set Address
		System.out.println ("Setting streetAddress value to Contact One (40726 West 3rd Ave.)");
		addressBook.get (0).setStreetAddress ("40726 West 3rd Ave.");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		//Set City
		System.out.println ("Setting City value to Contact One (Uma2tilla)");
		addressBook.get (0).setCity ("Umat2illa");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println ("Setting City value to Contact One (Umatilla)");
		addressBook.get (0).setCity ("Umatilla");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		//Set State
		System.out.println ("Setting State value to Contact One (Xx)");
		addressBook.get (0).setState ("Xx");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println ("Setting State value to Contact One (nc)");
		addressBook.get (0).setState ("nc");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println ("Setting State value to Contact One (FLL)");
		addressBook.get (0).setState ("FLL");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println ("Setting State value to Contact One (FL)");
		addressBook.get (0).setState ("FL");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		//Set Zip Code
		System.out.println ("Setting ZipCode value to Contact One (32f84)");
		addressBook.get (0).setZipCode ("32f784");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println ("Setting ZipCode value to Contact One (327844)");
		addressBook.get (0).setZipCode ("327844");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println ("Setting ZipCode value to Contact One (32784)");
		addressBook.get (0).setZipCode ("32784");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		//Set Phone
		System.out.println 
		("Setting Phone value to Contact One ((352)669-0862))");
		addressBook.get (0).setPhone ("(352)669-0862");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println ("Setting Phone value to Contact One (35260862)");
		addressBook.get (0).setPhone ("35260862");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println ("Setting Phone value to Contact One (3526690862)");
		addressBook.get (0).setPhone ("3526690862");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);		
		//Set Email
		System.out.println 
		("Setting Email value to Contact One (adamsjl3etsu.edu)");
		addressBook.get (0).setEmail ("adamsjl3etsu.edu");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println 
		("Setting Email value to Contact One (adamsjl3.etsu@edu)");
		addressBook.get (0).setEmail ("adamsjl3.etsu@edu");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println 
		("Setting Email value to Contact One (adamsjl3@etsu.edu)");
		addressBook.get (0).setEmail ("adamsjl3@etsu.edu");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		//Set Photo
		System.out.println 
		("Setting Photo value to Contact One (Pictures\\adamsJustin)");
		addressBook.get (0).setPhoto ("Pictures\\adamsJustin");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		System.out.println 
		("Setting Photo value to Contact One (Pictures\\adamsJustin.jpg)");
		addressBook.get (0).setPhoto ("Pictures\\adamsJustin.jpg");
		System.out.println (addressBook.get (0).toString ( ));
		clearAndStop(3);
		//Info
		System.out.println (theProgrammerInfo ( ));
	}//End main (String[])
	
	/**
	 * Clear and stop.
	 *
	 * @param counter the counter
	 */
	public static void clearAndStop (int counter)
	{
		Scanner input = new Scanner(System.in);
		System.out.println ("Press enter to continue");
		input.nextLine ( );
		for (int i = 0; i < counter; i++ )
		{
			System.out.println ("\n");
		}
	}//clearAndStop (int)
	
	/**
	 * The programmer info.
	 *
	 * @return the string
	 */
	public static String theProgrammerInfo ( )
	{
		return  ("Program Name: \tContactDemoDriver.java" +
				"\n  Programmer: \tJustin Adams" +
				"\n       Class: \tCSCI 1260-003" +
				"\n        Date: \t"+ date());	
	}//End theProgrammerInfo (String)

	/**
	 * Date.
	 *
	 * @return the string
	 */
	public static String date ( )
	{
		GregorianCalendar date = new GregorianCalendar();
		int iDay;		//Placeholder for day value
		int iMonth; 	//Placeholder for month value
		int iYear;		//Placeholder for year value
		String update;	//Returning data value in String
		iDay = date.get(Calendar.DAY_OF_MONTH);
		iMonth = date.get(Calendar.MONTH);
		iYear = date.get(Calendar.YEAR);
		update = ((iMonth+1)+"/"+iDay+"/"+iYear);
		return update;
	}//End date ( )
	
}//End ContactType
