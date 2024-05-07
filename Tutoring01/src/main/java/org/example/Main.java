package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        //variables come in two flavors

/////////////////////////////////primitives (types the processor understands natively)
        int x = 5;

        //defined a variable named x, giving it the type of int, and THEN assigning it the value to the right of the =
        //(in this case 5)

        double heightInFeet = 5.5;

        //defined a variable named height, giving it a type of double, and THEN ATTEMPTING to assign it the value of 5.5
        // double is a "floating point" type
        // double is structurally like scientific notation
        //          scientific notation:   mantissa x 10 ^ exponent
        //                                  1.234 x 10 ^ 2 = 123.4
        //                                  1234 x 10 ^ -1 = 123.4

        //          floating point:         mantissa (integer type, but fewer bits than int)
        //                                  exponent (integer type, but fewer bits than int)
        //                                  the power is TWO instead of 10
        //                                  mantissa x 2 ^ exponent

        //          because the power is 2 instead of 10, not all numbers will be representable in the same way

        double troubleNumber = 0.2 + 0.1;

        System.out.println(troubleNumber);

        if( troubleNumber == 0.3 ){
            System.out.println("we got inside the if statement");
        }

        //https://0.30000000000000004.com/ for more details

        boolean isRaining = false;

        //we've defined a boolean variable named isRaining and assigned the value false;
        //booleans are flags that hold true or false values
        //commonly used as part of if statement or looping logic


        char someLetter = 'a';
        //char data is designated with single quotes.
        //char variables hold only a single character
        //under the hood, chars are actually numbers (integer-type but only 2 bytes)
        //for conversion see ascii tables (possibly unicode)

        //https://www.asciitable.com/

        //for example:

        int shiftValue = 'a' - 'A';
        //we'll end up with a value of 32
        //because lowercase a is 32 positions on the table ahead of uppercase A

        System.out.println(shiftValue);

        //lets say we want to know which letter of the alphabet x is:

        int positionInAlphabetOfX = 'x' - 'a' + 1;

        System.out.println(positionInAlphabetOfX);

/////////////////////////////////////////////////////////////////////////////////

        //operators

        //math operators
        //java is "infix" meaning "normal" placement of the operands to either side of the operator
        // 5 + 7
        //other languages are prefix:  + 5 7
        //or postfix:                   5 7 +

        //generally when adding/subtracting/multiplying/dividing we'll get the same types as we started with

        int a = 5;
        int b = 7;

        int additionResult = a + b;
        int subtractionResult = a - b;
        int multiplcationResult = a * b;
        int divisionResult = a / b;

        System.out.println(additionResult);         //12
        System.out.println(subtractionResult);      //-2
        System.out.println(multiplcationResult);    //35
        System.out.println(divisionResult);         //0.71428571428571428571428571428571
                                                    //don't get this!
                                                    //when performing "integer division" Java (like many languages)
                                                    //truncates the result towards zero

        int negativeDivision = -5 / 7;

        System.out.println(negativeDivision);       //here we see when negative it still truncates "towards" zero

        //double division does not have this issue
        double c = 5.0;     //adding the .0 marks this literal value as a double
        double d = 7.0;

        double floatingPointDivision = c / d;

        System.out.println(floatingPointDivision);  //actually produces 0.71428571428571428571428571428571

        //objects/reference types (types we defined, or are defined in libraries, which are made out of primitives
        //or other component reference types)

        String name = "David";

        //here we define a String variable with the name "name" and assign the value "David"
        //STRINGS ARE SPECIAL IN JAVA
        //any other object (generally) will have to be created with the "new" keyword, but for string we can just
        //wrap our data with double-quotes ""

        //strings are "immutable" meaning they cannot be "mutated" (aka changed)
        //all string operations will produce a brand new String object rather than altering the data under the hood

        //Strings maintain a collection of "char" primitives (usually an array of them) along with a length variable
        //operations are defined for Strings as part of the Java language (we don't have to build our own String type)

    }

}