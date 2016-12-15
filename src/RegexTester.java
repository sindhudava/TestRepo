import java.util.StringTokenizer;
import java.util.regex.Matcher;

import java.util.regex.Pattern;


public class RegexTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//String browserOrAppRegex ="^(Mozilla)[/ 0-9 .\\s]*\\((iPhone|IPhone|iPod touch|iPad|iPod)[\\;\\s \\\:]*(U|\\s)[\\;|CPU][A-Z a-z @ \# 0-9 $ % ;'& . * , / {}()\: _ \\- \\s]*\\s(AppleWebKit/)[0-9.]*\\s[A-Z a-z  , / () \\s]*(Version/)[0-9 \\.]*\\s(Mobile)[0-9 A-z /]*\\s(Safari)[0-9 . /]*";
			/*browserList = getListByNewSeparator(browserOrAppRegex, false, false);
			
			for(int i=0;i<browserList.size();i++)
			{
			//Pattern p = Pattern.compile("^(Mozilla)[/ 0-9 .\\s]*\\((iPhone|IPhone|iPod touch|iPad|iPod)[\\;\\s \\\:]*(U|\\s)[\\;|CPU][A-Z a-z @ \# 0-9 $ % ;'& . * , / {}()\: _ \\- \\s]*\\s(AppleWebKit/)[0-9.]*\\s[A-Z a-z  , / () \\s]*(Version/)[0-9 \\.]*\\s(Mobile)[0-9 A-z /]*\\s(Safari)[0-9 . /]*");
			Matcher m = p.matcher(ua);
			if (m.matches())
			{
				System.out.println("True");
			}
			else 
				System.out.println("False");
			
			
			}*/
		 String s = "012ab56\n7ab\n0123ab";

		    String delims = "\n";

		    StringTokenizer st = new StringTokenizer(s, delims);
		            System.out.println("No of Token = " + st.countTokens());
System.out.println(st.countTokens());
		             while (st.hasMoreTokens())
		             {
		                 System.out.println(st.nextToken());
		             }

	}

}
