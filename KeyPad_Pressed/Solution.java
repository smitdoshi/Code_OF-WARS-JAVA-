import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ASCII_Table {
    
    public static boolean isBetween(int x, int lower, int upper) {
          return lower <= x && x <= upper;
        }
    
    public static void main(String args[]){
        /* ASCII Code Logic 
        for (int i=0; i< 127;i++){
            System.out.printf("%d \t %c\n",i,i);
        }
        */
        
        String phrase = "LOL";
        phrase = phrase.toUpperCase();
        //char[] chars = s1.toCharArray();
        char individual_char;
        int ascii;
        int count=0;
        int whitespaces = phrase.length() - phrase.replace(" ", "").length();
        //loop through chars array and print out values separated with a space
        for(int i = 0; i < phrase.length(); i++){
            //System.out.print(chars[i] + " ");
            individual_char = phrase.charAt(i);
            ascii = (int)individual_char;
            System.out.println("Ascii Value of "+individual_char+": "+ascii);
            
            // ABC = 2
            if (isBetween(ascii, 65, 67)){
                if(ascii == 65){
                    System.out.println("2 is pressed");
                    count+=1;
                }
                else if(ascii == 66){
                    System.out.println("2 is pressed");
                    count+=2;
                }
                else if(ascii == 67){
                    System.out.println("2 is pressed");
                    count+=3;
                }
            }
            // EFG = 3
            else if(isBetween(ascii, 68, 70)){
                if(ascii == 68){
                    System.out.println("3 is pressed");
                    count+=1;
                }
                else if(ascii == 69){
                    System.out.println("3 is pressed");
                    count+=2;
                }
                else if(ascii == 70){
                    System.out.println("3 is pressed");
                    count+=3;
                }
            }
            
            // GHI = 4
            else if(isBetween(ascii, 71, 73)){
                if(ascii == 71){
                    System.out.println("4 is pressed");
                    count+=1;
                }
                else if(ascii == 72){
                    System.out.println("4 is pressed");
                    count+=2;
                }
                else if(ascii == 73){
                    System.out.println("4 is pressed");
                    count+=3;
                }
            }
            // JKL = 5
            else if(isBetween(ascii, 74, 76)){
                if(ascii == 74){
                    System.out.println("5 is pressed");
                    count+=1;
                }
                else if(ascii == 75){
                    System.out.println("5 is pressed");
                    count+=2;
                }
                else if(ascii == 76){
                    System.out.println("5 is pressed");
                    count+=3;
                }

            }
            // MNO = 6
            else if(isBetween(ascii, 77, 79)){
                if(ascii == 77){
                    System.out.println("6 is pressed");
                    count+=1;
                }
                else if(ascii == 78){
                    System.out.println("6 is pressed");
                    count+=2;
                }
                else if(ascii == 79){
                    System.out.println("6 is pressed");
                    count+=3;
                }
            }
            // PQRS = 7
            else if(isBetween(ascii, 80, 83)){
                if(ascii == 80){
                    System.out.println("7 is pressed");
                    count+=1;
                }
                else if(ascii == 81){
                    System.out.println("7 is pressed");
                    count+=2;
                }
                else if(ascii == 82){
                    System.out.println("7 is pressed");
                    count+=3;
                }
                else if(ascii == 83){
                    System.out.println("7 is pressed");
                    count+=4;
                }
            }
            //  TUV = 8
            else if(isBetween(ascii, 84, 86)){
                if(ascii == 84){
                    System.out.println("8 is pressed");
                    count+=1;
                }
                else if(ascii == 85){
                    System.out.println("8 is pressed");
                    count+=2;
                }
                else if(ascii == 86){
                    System.out.println("8 is pressed");
                    count+=3;
                }
            }
            // WXYZ = 9
            else if(isBetween(ascii, 87, 90)){
                if(ascii == 87){
                    System.out.println("9 is pressed");
                    count+=1;
                }
                else if(ascii == 88){
                    System.out.println("9 is pressed");
                    count+=2;
                }
                else if(ascii == 89){
                    System.out.println("9 is pressed");
                    count+=3;
                }
                else if(ascii == 90){
                    System.out.println("9 is pressed");
                    count+=4;
                }
            }
        }
        
        System.out.println("Keypad pressed: "+(count+whitespaces));

         
    }

}
