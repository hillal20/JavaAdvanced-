package advancedAJava;
import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        int result = recursion(5);
//        System.out.println(result);
         //////////////////////////////// Array List
       ArrayList<Integer> myListOfIntegers  = new ArrayList<Integer>();
       int[] myArr = { 2,4,5,6,7,8,8,9,9,9};

        myListOfIntegers.add(100);
        myListOfIntegers.add(200);
        myListOfIntegers.add(300);
        myListOfIntegers.add(400);
        myListOfIntegers.add(500);
        myListOfIntegers.add(600);
        myListOfIntegers.add(700);
        myListOfIntegers.add(800);
        myListOfIntegers.add(900);
          for(Integer x : myListOfIntegers){
              System.out.println("x==> "+x);

          }

         String newArr  = Arrays.toString(myArr);
        System.out.println("newArr ==>"+ newArr );


        System.out.println(" array list ===>  "+  myListOfIntegers.remove(3));
        System.out.println(" array list ===>  "+  myListOfIntegers.size());
        System.out.println(" array list ===>  "+  myListOfIntegers.set(4,90));
        System.out.println(" array list ===>  "+  myListOfIntegers);


///////////////////// linkedList in java ///////

        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("hilal");
        myLinkedList.add("Bilal");
        myLinkedList.add("hshshs");
        myLinkedList.addFirst("bill");
        myLinkedList.addLast("gooo");

        System.out.println("myLinkedList ===>"+ myLinkedList);

        LinkedList hilal = new LinkedList();
        hilal.push(2);
        System.out.println("hilal ====>  " + hilal);

       ///// /////////list iterators
      ArrayList<String> names = new ArrayList<String>();
        names.add("bill");
        names.add("hill");
        names.add("gill");
        names.add("still");
        names.add("fill");
        names.add("kill");


        ListIterator<String> listIterator = names.listIterator();

        while(listIterator.hasNext()){
            System.out.println("it ====> "+listIterator.next());
        }


        System.out.println("names ====> "+ names );
        while(listIterator.hasPrevious()){
            System.out.println("it riv ====> "+listIterator.previous());
        }

        String st = " Derek Banas CA 12345   PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
        String regex = "\\s[0-9]{5}\\s";
        Pattern regexChecker =  Pattern.compile(regex);
        Matcher regexMatcher = regexChecker.matcher(st);
         System.out.println("regex ==> "+ regexMatcher.find());
         while(regexMatcher.find()){
             if(regexMatcher.group().length() != 0 ){
                 System.out.println("found ==> "+ regexMatcher.group().trim());

             }

         }
       ///////////////// Objects in arrayList

        ArrayList<Employee> newArry3 =  new ArrayList<Employee>();
         Employee emp1 = new Employee(1, "Hilal", 34);
        Employee emp2 = new Employee(2, "Jilal", 35);
        Employee emp3 = new Employee(3, "Bilal", 36);
        newArry3.add(emp1);
        newArry3.add(emp2);
        newArry3.add(emp3);


        System.out.println("===> newArr3 : "+newArry3);
         Iterator<Employee> newArray3It = newArry3.iterator();

          while(newArray3It.hasNext()){
              System.out.println("emp ===> "+ newArray3It.next().name);
          }
         for(Employee em : newArry3){
            System.out.println("emp ===> "+ em.name);
        }
//////////////////////////////////////////////////

        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("bill");
        arrayList4.add("hill");
        arrayList4.add("gill");
        arrayList4.add("still");
        arrayList4.add("fill");
        arrayList4.add("kill");

        ArrayList<String> arrayList5 = new ArrayList<String>();
        arrayList5.add("bill2");
        arrayList5.add("hill2");
        arrayList5.add("gill2");
        arrayList5.add("still2");
        arrayList5.add("fill2");
        arrayList5.add("kill2");

           arrayList4.addAll(arrayList5);
        for(String x : arrayList4 ){
            System.out.println(" s  ===> "+ arrayList5.get(2));
        }

        ArrayList<String> arrayList6 = new ArrayList<String>();
        arrayList6.add("bill");
        arrayList6.add("hill");
        arrayList6.add("gill");


        ArrayList<String> arrayList7 = new ArrayList<String>();

        arrayList7.add("bill");
        arrayList7.add("hill2");
        arrayList7.add("hill");

        arrayList7.retainAll(arrayList6);
        for (String x: arrayList7) {
            System.out.println( " a ===> "+ x);
        }



    }// end of main


    public static int recursion (int x ){
                  if(x== 0){
                      return 1;
                  }
         return  x * recursion(x-1);  // 4 *  * 3  * 2 * * 1 * 1
                //
    }
}
