import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class FancyWordRunner 
{
    public static void main(String[] args) 
    {
        //add code to test the scrambleWord method
        
        String[] tests = " TAN ABRACADABRA WHOA AARDVARK EGGS A AA AAA AAAA AAAAA APLUS ABABBABAA".split(" ");
        for( String it : tests )
        {
        	System.out.println( FancyWord.scrambleWord( it ));
        }
        
        /* outs
           the first line is a space

		TNA
		BARCADABARA
		WHOA
		ARADVRAK
		EGGS
		A
		AA
		AAA
		AAAA
		AAAAA
		PALUS
		BABABBAAA

		*/

        //add code to test the scrambleOrRemove method
        
        List<String> testList = new ArrayList<String>(Arrays.asList(tests));
        System.out.println( testList );
        FancyWord.scrambleOrRemove( testList );
        System.out.println( testList );
        
        /* outs

		[, TAN, ABRACADABRA, WHOA, AARDVARK, EGGS, A, AA, AAA, AAAA, AAAAA, APLUS, ABABBABAA]
		[TNA, BARCADABARA, ARADVRAK, PALUS, BABABBAAA]

		*/

    }
}
