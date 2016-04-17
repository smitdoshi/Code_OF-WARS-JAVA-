public class DigPow {
    
    public static long digPow(int n, int p) {
        // your code
        // your code
        int number_seprator = n;
        int num_inter = 0;
        //int seperated_num = 0;
        int result = 0;
        int raise = p;
        int loop = 1;
        int num_power_increase = 0;
        int return_value = 0;
        boolean flag = false;
        
        int length = (int) Math.log10(n) + 1;
        System.out.println("Length: "+length);
        
        // Another way for above code is FORE Each loop
        
        for(char seperated_num : String.valueOf(number_seprator).toCharArray()) {
            System.out.println("Individual Number: "+seperated_num);
            // Now converting them to Int and rasing them
            
            num_inter = Integer.parseInt(String.valueOf(seperated_num));
            System.out.println("Individual Number in Integer: "+num_inter);
            // Raise Logic:
            if(loop <=length){
                num_power_increase = (int)Math.pow(num_inter,raise);
                System.out.println("Result of Number Power Increase : "+num_power_increase);
                result = result + num_power_increase;
                System.out.println("Result : "+result);
                raise ++;
            }
            
        }
        
        if(result%n==0){
            flag=true;
        }
        else{
            flag = false;
            return_value = -1;
            System.out.println ("Return value: "+return_value);
            return return_value;
            
        }
        if(flag==true){
            return_value = result/n;
            System.out.println ("Return value: "+return_value);
            return return_value;
        }
        
        
        return return_value ;
    }
}