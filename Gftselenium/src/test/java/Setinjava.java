import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.testng.annotations.Test;

public class Setinjava {

	
	@Test
	public void add()
	{
		Set<String> s =new HashSet<String>();
		System.out.println(s.size());
		s.add("India");
		s.add("USA");
		s.add("Japan");
		s.add("Brazil");
		System.out.println(s.size());
		Iterator<String> it =s.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
	}
}

