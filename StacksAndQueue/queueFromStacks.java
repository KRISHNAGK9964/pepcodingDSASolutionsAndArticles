<<<<<<< HEAD
Stack To Queue Adapter - Add Efficient
Easy

1. You are required to complete the code of our StackToQueueAdapter class. The clasS should mimic the behaviour of a Queue and implement FIFO semantic.
2. Here is the list of functions that are written in the class 
    2.1. add -> Accepts new data if there is space available in the underlying array or 
    print "Queue overflow" otherwise.
    2.2. remove -> Removes and returns value according to FIFO, if available or print 
    "Queue underflow" otherwise and return -1.
    2.3. peek -> Returns value according to FIFO, if available or print "Queue 
    underflow" otherwise and return -1.
    2.4. size -> Returns the number of elements available in the queue.
3. Input and Output is managed for you.

Constraints
Note -> add and size should work in constant time. remove and peek should work in linear time.

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

add 10
add 20
add 30
add 40
add 50
remove
remove
add 60
add 70
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
quit

Sample Output
10
20
30
30
40
40
50
50
60
60
70
70
Queue underflow
Queue underflow


import java.io.*;
import java.util.*;

public class Main {

  public static class StackToQueueAdapter {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public StackToQueueAdapter() {
      mainS = new Stack<>();
      helperS = new Stack<>();
    }

    int size() {
      // write your code here
      return (mainS.size()+helperS.size());
    }

    void add(int val) {
      // write your code here
      mainS.push(val);
    }

    int remove() {
      // write your code here
      if(helperS.size()==0 && mainS.size()==0){
        System.out.println("Queue underflow");
        return -1;
      }
      if(helperS.size()==0){
      while( mainS.size()>1){
        helperS.push(mainS.pop());
      }
      int val=mainS.pop();
      return val;
      }else{
        return helperS.pop();
      }
      
    }

    int peek() {
      // write your code here
      if(helperS.size()==0 && mainS.size()==0){
        System.out.println("Queue underflow");
        return -1;
      }
      if(helperS.size()==0){
      while( mainS.size()>1){
        helperS.push(mainS.pop());
      }
      int val=mainS.pop();
      helperS.push(val);
      return val;
      }else{
        return helperS.peek();
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StackToQueueAdapter qu = new StackToQueueAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}


Stack To Queue Adapter - Remove Efficient
Easy

1. You are required to complete the code of our StackToQueueAdapter class. The Class should mimic the behaviour of a Queue and implement FIFO semantic.
2. Here is the list of functions that are written in the class
    2.1. add -> Accepts new data if there is space available in the underlying array or 
    print "Queue overflow" otherwise.
    2.2. remove -> Removes and returns value according to FIFO, if available or print 
    "Queue underflow" otherwise and return -1.
    2.3. peek -> Returns value according to FIFO, if available or print "Queue 
    underflow" otherwise and return -1.
    2.4. size -> Returns the number of elements available in the queue.
3. Input and Output is managed for you.

Constraints
Note -> remove, peek and size should work in constant time. add should work in linear time.

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

add 10
add 20
add 30
add 40
add 50
remove
remove
add 60
add 70
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
quit

Sample Output
10
20
30
30
40
40
50
50
60
60
70
70
Queue underflow
Queue underflow

import java.io.*;
import java.util.*;

public class Main {

  public static class StackToQueueAdapter {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public StackToQueueAdapter() {
      mainS = new Stack<>();
      helperS = new Stack<>();
    }

    int size() {
      // write your code here
      return mainS.size();
    }

    void add(int val) {
      // write your code here
      
      while(mainS.size()>0){
        helperS.push(mainS.pop());
      }
      mainS.push(val);
      while(helperS.size()>0){
        mainS.push(helperS.pop());
      }

    }

    int remove() {
      // write your code here
      if(mainS.size()==0){
        System.out.println("Queue underflow");return -1;
      }
      return mainS.pop();
      
    }

    int peek() {
      // write your code here
      if(mainS.size()==0){
        System.out.println("Queue underflow");
        return-1;
      }
      return mainS.peek();
      
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StackToQueueAdapter qu = new StackToQueueAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
=======
Stack To Queue Adapter - Add Efficient
Easy

1. You are required to complete the code of our StackToQueueAdapter class. The clasS should mimic the behaviour of a Queue and implement FIFO semantic.
2. Here is the list of functions that are written in the class 
    2.1. add -> Accepts new data if there is space available in the underlying array or 
    print "Queue overflow" otherwise.
    2.2. remove -> Removes and returns value according to FIFO, if available or print 
    "Queue underflow" otherwise and return -1.
    2.3. peek -> Returns value according to FIFO, if available or print "Queue 
    underflow" otherwise and return -1.
    2.4. size -> Returns the number of elements available in the queue.
3. Input and Output is managed for you.

Constraints
Note -> add and size should work in constant time. remove and peek should work in linear time.

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

add 10
add 20
add 30
add 40
add 50
remove
remove
add 60
add 70
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
quit

Sample Output
10
20
30
30
40
40
50
50
60
60
70
70
Queue underflow
Queue underflow


import java.io.*;
import java.util.*;

public class Main {

  public static class StackToQueueAdapter {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public StackToQueueAdapter() {
      mainS = new Stack<>();
      helperS = new Stack<>();
    }

    int size() {
      // write your code here
      return (mainS.size()+helperS.size());
    }

    void add(int val) {
      // write your code here
      mainS.push(val);
    }

    int remove() {
      // write your code here
      if(helperS.size()==0 && mainS.size()==0){
        System.out.println("Queue underflow");
        return -1;
      }
      if(helperS.size()==0){
      while( mainS.size()>1){
        helperS.push(mainS.pop());
      }
      int val=mainS.pop();
      return val;
      }else{
        return helperS.pop();
      }
      
    }

    int peek() {
      // write your code here
      if(helperS.size()==0 && mainS.size()==0){
        System.out.println("Queue underflow");
        return -1;
      }
      if(helperS.size()==0){
      while( mainS.size()>1){
        helperS.push(mainS.pop());
      }
      int val=mainS.pop();
      helperS.push(val);
      return val;
      }else{
        return helperS.peek();
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StackToQueueAdapter qu = new StackToQueueAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}


Stack To Queue Adapter - Remove Efficient
Easy

1. You are required to complete the code of our StackToQueueAdapter class. The Class should mimic the behaviour of a Queue and implement FIFO semantic.
2. Here is the list of functions that are written in the class
    2.1. add -> Accepts new data if there is space available in the underlying array or 
    print "Queue overflow" otherwise.
    2.2. remove -> Removes and returns value according to FIFO, if available or print 
    "Queue underflow" otherwise and return -1.
    2.3. peek -> Returns value according to FIFO, if available or print "Queue 
    underflow" otherwise and return -1.
    2.4. size -> Returns the number of elements available in the queue.
3. Input and Output is managed for you.

Constraints
Note -> remove, peek and size should work in constant time. add should work in linear time.

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

add 10
add 20
add 30
add 40
add 50
remove
remove
add 60
add 70
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
peek
remove
quit

Sample Output
10
20
30
30
40
40
50
50
60
60
70
70
Queue underflow
Queue underflow

import java.io.*;
import java.util.*;

public class Main {

  public static class StackToQueueAdapter {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public StackToQueueAdapter() {
      mainS = new Stack<>();
      helperS = new Stack<>();
    }

    int size() {
      // write your code here
      return mainS.size();
    }

    void add(int val) {
      // write your code here
      
      while(mainS.size()>0){
        helperS.push(mainS.pop());
      }
      mainS.push(val);
      while(helperS.size()>0){
        mainS.push(helperS.pop());
      }

    }

    int remove() {
      // write your code here
      if(mainS.size()==0){
        System.out.println("Queue underflow");return -1;
      }
      return mainS.pop();
      
    }

    int peek() {
      // write your code here
      if(mainS.size()==0){
        System.out.println("Queue underflow");
        return-1;
      }
      return mainS.peek();
      
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StackToQueueAdapter qu = new StackToQueueAdapter();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
>>>>>>> a413ffa7abff2a67ed538cec1c267806909b2453
}