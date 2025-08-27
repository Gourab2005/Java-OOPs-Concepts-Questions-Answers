// Using command line argument write a java program to print Object Oriented Programming Using Java. 
public class CommandLinePrinter{
    public static void main(String[] args){
        
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}

/*
java CommandLinePrinter "I am Gourab" "I  want to study" (example input)
(output)
I am Gourab
I  want to study
*/