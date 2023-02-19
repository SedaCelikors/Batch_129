package day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    /*
    "Queue" lar da ilk gelen ilk isleme girer.(First In First Out==>FIFO)
     Bazen de son gelen ilk isleme girer.(Last In First Out==>LIFO)
     "Deque"==>"Double Ended Queue" hem FIFO hem de LIFO icin kullanilir

     "Queue" bir interface dir,buyuzden constructor yoktur,dolayisiyla object olustururken "new keyword" unden sonra kullanilamaz.
     Data type i "Queue" olan bir object olusutmrak icin "new" keyword unden sonra i)LinkedList veya ii)PriorityQueue Class lari
     kullanilir.

     "Queue" olustururken constructor olarak "PriorityQueue" kullanirsaniz, elemanlari kendi kullanacaginiz kurala gore
     siralama hakkiniz olur.
     */

    public static void main(String[] args) {

        Queue <String> myqueue = new LinkedList();
        myqueue.add("Milk");
        myqueue.add("Butter");
        myqueue.add("Jan");
        myqueue.add("Egg");
        myqueue.add("Luxury water");

        System.out.println(myqueue);//[Milk, Butter, Jan, Egg, Luxury water]

        //Retrieves and removes the head of this queue, or returns null if this queue is empty.
        myqueue.poll();

        //Retrieves and removes the head of this queue.
        //This method differs from poll() only in that it throws an exception if this queue is empty.
        //Returns:the head of this queue
        myqueue.remove();


        //Retrieves, but does not remove, the head of this queue.
        //This method differs from peek only in that it throws an exception if this queue is empty.
        //Throws:NoSuchElementException – if this queue is empt
        myqueue.element();

        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        myqueue.peek();

        /*
        poll() ile remove() ikiside ilk elemani siler ve size verir.
        poll() bos "Queue" lar icin "null" verir, remove() ise bos"Queue" lar icin exception atar
          */

        /*
        element() ile peek() ikiside ilk elemani silmeden ve size verir.
        peek() bos "Queue" lar icin "null" verir, element() ise bos"Queue" lar icin exception atar
          */


        /*
        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        When using a capacity-restricted queue, this method is generally preferable to add,
        which can fail to insert an element only by throwing an exception.
        Returns:true if the element was added to this queue, else false
        Throws:
        ClassCastException – if the class of the specified element prevents it from being added to this queue
        NullPointerException – if the specified element is null and this queue does not permit null elements
        IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */
        boolean r = myqueue.offer("Avocado");
        System.out.println(r); //true

        System.out.println(myqueue); //[Jan, Egg, Luxury water, Avocado]


        Queue <String> yourqueue = new PriorityQueue<>();
        yourqueue.add("Milk");
        yourqueue.add("Butter");
        yourqueue.add("Jan");
        yourqueue.add("Egg");
        yourqueue.add("Luxury water");
        System.out.println(yourqueue);//[Butter, Egg, Jan, Milk, Luxury water]
    }
}
