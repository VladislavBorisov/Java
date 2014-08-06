import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;



public class PersonHashMap {
	
	private HashMap<String,Person> myMap = new HashMap<String,Person>();
	
	public void addPerson(Person p){
		myMap.put(p.getMail(), p);		
	}// end addPerson
	
	public void removePerson(String key){
		myMap.remove(key);
	}// removePerson
	
	public void printPersonInfo(String key){
		Person temp = myMap.get(key);
		if(temp != null){
			System.out.println(temp.getFirstName());
			System.out.println(temp.getLastName());
			System.out.println(temp.getSex());
			System.out.println(temp.getAge());
		}
		else{
			System.out.println("No results");
		}
	}// end printPersonInfo()
	
	public void printAllPerson(){
		Collection<Person> col = myMap.values();
		Iterator<Person> it = col.iterator();
		Person temp;
		
		while(it.hasNext()){
			temp = it.next();
			printPersonInfo(temp.getMail());
			System.out.println("-----------------------");
		}
	}// end printAllPerson
	
	public void sortedPrint(){
		ArrayList<Person> unSorted = new ArrayList<Person>();
		ArrayList<Person> sorted = new ArrayList<Person>();
		sorted.add(new Person("","",'a',0,""));
		
		unSorted.addAll(myMap.values());
		Person unS;
		Person s;
		for(int i=0;i<unSorted.size();i++){
			 unS = unSorted.get(i);
			for(int j=0;j<sorted.size();j++){
				s =  sorted.get(j);
				if(unS.getAge()<s.getAge()){
					sorted.add(j,unS);
				}
			}// end inner for
			//if(!sorted.contains(unS)){sorted.add(unS);} 
		}// end ouuter for
		
		for(int i=0;i<sorted.size();i++){
			System.out.println(sorted.size());
			printPersonInfo((sorted.get(i)).getMail());
			System.out.println("-------------");
		}
	}

}// end PersonHashMap
