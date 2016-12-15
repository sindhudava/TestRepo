import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HashMapEg {

	
	public static void main(String[] args) {

		Map e=new Hashtable();
		e.put(1, "Sindhu");
		e.put(2, "Bindhu");
		e.put(1, "indhu");
		/*e.put(null,"Jyothi");
		e.put(null,"Vishan");
		e.put(3, null);*/
		
		System.out.println(e);
		//{null=Vishan, 1=indhu, 2=Bindhu}
		
		Set s=new HashSet();
		s.add("SIndhu");
		s.add("Bindhu");
		s.add("SIndhu");
		
		System.out.println(s);
		//[SIndhu, Bindhu]

		
		List<String> a=new ArrayList<String>();
		a.add("Sindhu");
		a.add("Bindhu");
		
		List<String> b=new ArrayList<String>();
		b.add("Vinay");
		b.add("Vishan");
		
		Map<String,List<String>> m=new HashMap<String,List<String>>();
		m.put("A", a);
		m.put("B", b);
		
		for(Map.Entry<String,List<String>> ab:m.entrySet())
		{
			String key=ab.getKey();
			List<String> l=ab.getValue();
			System.out.println(l);
		}
	}

}
