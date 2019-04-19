import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Foo {
	public static void yaz(HashSet<String> gelen)
	{
		Iterator<String> it = gelen.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
		}
	}
	public static TreeSet<String> sirala(HashSet<String> gelen)
	{
		TreeSet<String> ts = new TreeSet<String>(gelen);
		return ts;
	}
	public static void main(String[] args){
		
		HashSet<String> hs = new HashSet<String>();
		HashSet hs1 = new HashSet();
		hs.add("ahmaet");
		hs.add("mehmet");
		hs.add("burak");
		hs.add("ahmaet");
		System.out.println(hs);
		HashSet<String> hsyeni = new HashSet<String>();
		hsyeni.add("a");
		hsyeni.add("b");
		hs.addAll(hsyeni);
		//yaz(hs);
		System.out.println(hs);
		System.out.println(sirala(hs));
		
	}
	
}