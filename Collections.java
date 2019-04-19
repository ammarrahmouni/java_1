import java.util.*;

public class Collections{
    public static void main(String[] args){

        // HASHSET of Data Structure
        System.out.println("\t\t\t\t\t\t\"HASHSET of Data Structure\"");
        HashSet<String> names = new HashSet<String>();
        HashSet<String> name = new HashSet<String>();
        names.add("ammar");names.add("ahmet");names.add("ziyad");names.add("mehmet");names.add("omar");
        names.add("mustafa");names.add("ammar");names.add("mehmet");

        System.out.println("The HashSet names of data Structure : " + names);
        System.out.println("Is popularCities Hashset empty? : " + names.isEmpty());
        System.out.println("Number of cities in the HashSet :" + names.size());
        name.addAll(names);
        System.out.println("Add data from one HashSet structure to another HashSet : " + name);
        name.clear();
        names.removeAll(names);
        System.out.println("Delete all data from the name HashSet structure :" + name);
        System.out.println("Delete all data from the names HashSet structure :" + names);

        HashSet<String> city = new HashSet<String>();
        city.add("Marrakesh");city.add("Manila");city.add("amsterdam");city.add("Athens");city.add("Barcelona");
        city.add("New York");city.add("Paris");city.add("cairo");city.add("Dubai");city.add("Rome");city.add("Istanbul");
        city.add("Tokyo");city.add("Venice");city.add("london");city.add("Los Angeles");city.add("Madrid");
        city.add("Sofia");city.add("Singapore");city.add("Mexico");city.add("Baghdad");city.add("Aleppo");

        System.out.println("The HashSet citys of data Structure : " + city);
        
        
        System.out.println("Following are few key points to note about HashSet in Java:");
        System.out.println("1.HashSet cannot contain duplicate values.");
        System.out.println("2.HashSet allows null value.");
        System.out.println("3.HashSet is an unordered collection. It does not maintain the order in which the elements are inserted.");
        // HASHSET of Data Structure
        
        System.out.println("-------------------------------");
        
        // Check if the HashSet contains an element
        String you = "khaled";
        if(names.contains(you))
        {
            System.out.println("Your name is in liste : " + you);
        }
        else
        {
            System.out.println("Your name is not in liste : " + you);
        }

        String your = "ammar";
        if(names.contains(your))
        {
            System.out.println("Your name is in liste : " + your);
        }
        else
        {
            System.out.println("Your name is not in liste : " + your);
        }
        // Check if the HashSet contains an element

        System.out.println("-------------------------------");

        // Roaming in the structure
        System.out.println("Roaming in the structure :");
        Iterator<String> it = names.iterator();
        int i = 1;
        while(it.hasNext())
        {
            String value = it.next();
            System.out.println(i + "." + value);
            i++;
        }
        // Roaming in the structure

        System.out.println("-------------------------------");

        // Remove an element from a HashSet
        names.remove("mehmet");
        Iterator<String> its = names.iterator();
        while(its.hasNext())
        {
            String value = its.next();
            
            if(value.equals("omar"))
            {
                its.remove();
            }
        }
        System.out.println("Delete data from the structure :" + names);
        // Remove an element from a HashSet

        System.out.println("-------------------------------");
        System.out.println("-------------------------------");

        // TREESET of Data Structure
        System.out.println("\t\t\t\t\t\t\"TREESET of Data Structure\"");
        TreeSet<String> words = new TreeSet<String>();
        words.add("Q");words.add("A");words.add("F");words.add("F");words.add("Z");words.add("B");words.add("A");
        words.add("S");words.add("D");words.add("R");words.add("E");words.add("W");words.add("T");words.add("Y");
        words.add("U");words.add("I");words.add("O");words.add("P");words.add("G");words.add("H");words.add("J");
        words.add("K");words.add("L");words.add("X");words.add("V");words.add("N");words.add("X");words.add("C");
        words.add("M");words.add("a");words.add("amsterdam");words.add("london");words.add("cairo");

        System.out.println("The TreeSet of Data Structure : " + words);
        System.out.println("Number of elements in the TreeSet : " + words.size());
        System.out.println("First elemnts : " + words.first()); // Navigating through the TreeSet
        System.out.println("lasst elemnts : " + words.last());  // Navigating through the TreeSet
        words.remove("london");  // Remove an element from a TreeSet
        words.remove("A");      // Remove an element from a TreeSet
        words.remove("Z");      // Remove an element from a TreeSet
        System.out.println("Delete data from the TreeSet structure :" + words);
        words.pollFirst();  // Retrieve and remove the first  element from the TreeSet
        words.pollLast();   // Retrieve and remove the last element from the TreeSet
        System.out.println("Delete first and last data from the TreeSet structure :" + words);
        words.removeAll(words);   //Remove all element from a TreeSet
        System.out.println("Delete all data from the words TreeSet structure :" + words);

        System.out.println("Following are few key points to note about TreeSet in Java:");
        System.out.println("1.TreeSet cannot contain duplicate elements.");
        System.out.println("2.The elements in a TreeSet are sorted as per their natural ordering.");
        System.out.println("3.TreeSet cannot contain null value.");
        // TREESET of Data Structure

        System.out.println("-------------------------------");
        
        // Check if an element exists in the TreeSet
        for(String w : city)
        {
            if(words.contains(w))
            {
                System.out.println("TreeSet contains the element : " + w);
            }
            else
            {
                System.out.println("TreeSet does not contain the element : " + w);
            }
        }
        // Check if an element exists in the TreeSet

        System.out.println("-------------------------------");
        System.out.println("-------------------------------");

        // LinkedList of Data Structure
        System.out.println("\t\t\t\t\t\t\"LinkedList of Data Structure\"");
        LinkedList<String> food = new LinkedList<String>();
        LinkedList<String> food1 = new LinkedList<String>();
        food.add("salad");food.add("sandwich");food.add("bread");food.add("steak");food.add("tuna steak");
        food.add("fish");food.add("shrimp");food.add("rice");food.add("spaghetti");food.add("pizza");
        food.add("hamburger");food.add("eggs");food.add("cheese");food.add("salad");food.add("sausages");
        food.add("apple juice");food.add("milk");food.add("candy");food.add("cookie");food.add("cake");

        System.out.println("The LinkedList foods of data Structure : " + food);

        food.add(2, "kepab"); food.add(3, "apple juice");food.add(0, "milk");
        food.add(4, "candy");food.add(2, "cookie");food.add(7, "cake");  // liste add element in the number of index
       
        System.out.println("The LinkedList foods of data Structure : " + food);
        System.out.println("The First element of The LinkedList:" + food.getFirst());
        System.out.println("6.element is :" + food.get(6));
        System.out.println("Switch between milk and shaowrma:" + food.set(0, "shaowrma"));
        System.out.println("Delete The First element: " + food.removeFirst());
        System.out.println("Delet The First element:" + food.remove());
        System.out.println("Delete The Last elemnt: " + food.removeLast());
        System.out.println("Number of elemnts: " + food.size());
        food.remove(); // Delete The Fitst element of the LinkedList
        food1.addAll(food);  //Add all element from food to food1
        food.clear();  // Delete The LinkedList
        System.out.println("Delete The LinkedList: " + food);
        // LinkedList of Data Structure

        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        
        //ArrayList of Data structure
        System.out.println("\t\t\t\t\t\t\"ArrayList of Data Structure\"");
        ArrayList<String> food2 = new ArrayList<String>();
        food2.add("salad");food2.add("sandwich");food2.add("bread");food2.add("steak");food2.add("tuna steak");
        food2.add("fish");food2.add("shrimp");food2.add("rice");food2.add("spaghetti");food2.add("pizza");
        food2.add("hamburger");food2.add("eggs");food2.add("cheese");food2.add("salad");food2.add("sausages");
        food2.add("apple juice");food2.add("milk");food2.add("candy");food2.add("cookie");food2.add("cake");

        food2.add(0, "kola");  //If the object i is indexed b is added to the list,scrolls elements
        System.out.println("ArrayList of Data Structure :" + food2);
        System.out.println("6.element is :" + food2.get(6));
        System.out.println("Switch between cake and Baklava:" + food2.set(19, "Baklava"));
        System.out.println("Switch between cake and Baklava:" + food2.set(19, "kunefe"));
        System.out.println("Introduces the first Indix for the value we are looking for :" + food2.indexOf("salad"));
        System.out.println("Introduces the last Indix for the value we are looking for :" + food2.lastIndexOf("salad"));
        System.out.println("Number of elemnts: " + food2.size()); 
        //ArrayList of Data structure

        System.out.println("-------------------------------");
        System.out.println("-------------------------------");

        //Queue of Data structure
        System.out.println("\t\t\t\t\t\t\"Queue of Data Structure\"");
        Queue <String> kyrk = new LinkedList<String>();
        kyrk.add("salad");kyrk.add("sandwich");kyrk.add("bread");kyrk.add("steak");kyrk.add("tuna steak");
        kyrk.add("fish");kyrk.add("shrimp");kyrk.add("rice");kyrk.add("spaghetti");kyrk.add("pizza");
        kyrk.add("hamburger");kyrk.add("eggs");kyrk.add("cheese");kyrk.add("salad");kyrk.add("sausages");
        kyrk.add("apple juice");kyrk.add("milk");kyrk.add("candy");kyrk.add("cookie");kyrk.add("cake");

        System.out.println("Queue of LinkedList : " + kyrk);
        //Queue of Data structure
         
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");






    }
}