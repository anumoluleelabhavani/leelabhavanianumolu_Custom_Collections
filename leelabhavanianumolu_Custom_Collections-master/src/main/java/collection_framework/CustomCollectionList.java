package collection_framework;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class CustomCollectionList {
	
	public static final Logger log=LogManager.getLogger(CustomCollectionList.class);
	 public static void main(String ar[]) {
         CustomList<String> list = new CustomList<String>();
          Scanner ob=new Scanner(System.in);
       int choice;
         
         list.add("Mango");
         list.add("Banana");
         list.add("Apple");
         list.add("Orange");
         list.add("Strawberry");
         list.add("Grapes");
         list.add("Watermelon");
         list.add("Papaya");
         list.add("Guava");
         list.add("Kiwi");

         log.info("The initial elements in the list are");
         list.display();
     

       do{
         log.info("Enter Your Choice:\n1.Add\n2.Remove\n3.View an element\n4.Display the List\n5.exit");
          choice=ob.nextInt();
        

        switch(choice){


        case 1:log.info("\nEnter the element you want to add");
               String element=ob.next();
               list.add(element);
               log.info("\nThe custom ArrayList again after adding the element is:\n");
               list.display();
               break;

       

       case 2: log.info("\nEnter the index of element you want to remove");
               int remove_index=ob.nextInt();
               log.info("\nThe removed element is:   "+list.remove(remove_index));
               log.info("\nThe custom ArrayList again after removal the element is:\n");
               list.display();
               break;

      case 3:  log.info("\nEnter the element index that you want to view");
               int view_index=ob.nextInt();
               log.info("\nThe element at the given index is:   "+list.get(view_index));
               break;

     case 4:   log.info("The elements in the list are: ");
               list.display();
               break;
     
          }


}while(choice!=5);

  }
}
