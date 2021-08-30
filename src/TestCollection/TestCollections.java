package TestCollection;

import java.util.*;

public class TestCollections {
public static void main(String[] args) {
	List mylist=new ArrayList();
	mylist.add("Alex");
	mylist.add("Jane");
	mylist.add("Mark");
	print(mylist);
	Set myset=new HashSet();
	myset.add("james");
	myset.add("ronaldo");
	myset.add("stive");
	myset.add("lorene");
	print(myset);
	
	Map mymap=new HashMap();
	mymap.put("name", "jhon");
	mymap.put("age","20");
	mymap.put("gender","M");
	System.out.println(mymap.get("name"));
	print(mymap.keySet());
	print(mymap.values());
}
 public static void print(Collection collection) {
	 for (Object object : collection) {
			System.out.println(object);
		}
		
	}

}
