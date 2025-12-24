import java.util.Scanner;

public class RomanToInteger {

    static int getValue(char ch){
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    static int RomanToDecimal(String roman){
        int result = 0;

        for(int i=0;i<roman.length();i++){
            int current = getValue(roman.charAt(i));
            if(i+1 < roman.length()){
                int next = getValue(roman.charAt(i+1));

                if(current < next){
                    result += (next - current);
                    i++;
                }
                else{
                    result += current;
                }
            }
            else{
                result += current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(RomanToDecimal(s));
    }
    
}
