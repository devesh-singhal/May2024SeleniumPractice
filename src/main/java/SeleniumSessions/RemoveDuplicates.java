package SeleniumSessions;

import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
//    List <Integer> myList = List.of(0,2,3,3,5,5,1,1,8,8) ;
//    System.out.println(myList.size());
//    myList = myList.stream().distinct().toList();
//    System.out.println(myList.size());
//    System.out.println(myList.toString());
//     
     //*****************Java hashset*************
    
     List<Object> myList1 =  List.of(0,2,3,3,5,5,1,1,8,8) ;
    //  System.out.println(myList1.size());
     HashSet<Object> set = new HashSet (myList1);
     myList1 = List.of(set.toArray());
     System.out.println(myList1.size());
     System.out.println(myList1.toString());
     
     
     
     
     
     
     
     
     
     
     
     
     
     

    
	}

}
