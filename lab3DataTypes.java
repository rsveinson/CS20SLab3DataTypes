/* lab exercise 3 Data types
 * experiment with data compatibility,
 * assignment statements, and type safety
 */
 
 public class lab3DataTypes
 {  // begin lab3
    public static void main(String[] args)
    {  // begin main
    
        int i = 5;              // integer
        byte b = 0;             // byte
        double d = 2.556789;            // floating point value
        char ch;                // char value
        boolean bool;           // boolean vaule
        String st = "hello";    // string value
        
        //ConsoleReader console = new ConsoleReader(System.in);
        
        b = 127;
        
    // ***** ASSIGNMENT STATEMENTES *****
    
        ch = 'a';           // here's an example of an assignment to a char
                            // note that there is only one character and
                            // that it is enclosed in single quotes ' '
                            
        st = "help me I'm trapped";     // example of string assignment
        // note strings are multiple characters and
                                        // are enclosed in double quotes " "
                                        
    /* for each question you will design and run an experiment using Java code
     * Some questions may requre more lines of code than others.
     * To answer each question you will write the code, compile the class, run the program,
     * observe the results and make conclusios base on those observations.
     * 
     * The code for the first 3 questions is provided for you below. To run the experiment
     * Q1 simply uncomment the appropriate lines of code, compile and run the class and answer
     * the question based on your observations
     * 
     * Once you have finished a question comment the code before you move on to the
     * next question so that your output window doesn't get 
     * messy and hard to read.
     * 
     * YOu will have to design the experimaent and write the code for questoins 4-13.
     */
        
        //Q1
        //d = 8;
        //System.out.println("d = " + d);
        
        //Q2
        //d = i;
        //System.out.println("d = " + d);
        
        //Q3
        //i = 3.45567788;       // code for AQ3
        //System.out.println("i = " + i);

            i = Integer.MAX_VALUE;
            System.out.println(i);
            i = i + 1;
            System.out.println(i);
    // ***** closing statement ******
        
        System.out.println("end");
        
    }  // end main 
 }  // end lab 3