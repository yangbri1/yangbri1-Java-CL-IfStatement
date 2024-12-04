
public class IfStatements {
    /**
     * This method should return the parameter `x` if the parameter `bool` is true,
     * otherwise return the parameter `y`.
     * 
     * Using the paremeters `bool`, `x`, and `y`, to return the correct value.
     *
     * @param bool - a true or false value.
     * @param x    - first number to be compared.
     * @param y    - second number to be compared.
     * @return - x if bool is true, otherwise return y.
     */
    public int exercise1(boolean bool, int x, int y) {  // method w/ public access modifier, returns an int data type
        // testing out ternary operator here instead of if statements
        return (bool ? x : y);  // if variable "bool" is true, return int "x" otw return int "y"
    }

    /**
     * This method should return "Positive" if the parameter `x` is a positive number, "Negative" if the parameter `x` is a negative number, or "Zero" if the parameter `x` is zero.
     *  
     * @param x - a number that could be positive, negative, or zero.
     * @return - "Positive", "Negative", or "Zero" depending on the input.
     */
    public String exercise2(int x) {    // method w/ public access modifier, returns String
        // String numberType = "";
        if(x < 0){
            return("Negative");
        }
        else if(x == 0){
            return("Zero");
        }
        else{
            return("Positive");
        }
        // return null;
    }

    /**
     * This method should return "Yes", "No", or depending on whether the parameter `year` represents a leap year.
     * 
     * - Return "No" if `year` is NOT divisible by 4
     * - If `year` is divisible by 4, then:
     *      - Return "Not quite" if `year` is also divisible by 100 but NOT by 400
     *      - Return "Yes" if `year` is also divisible by 100 AND by 400
     *      - Return "Yes" otherwise
     * 
     * To check if a value is divisible by another, use the modulo operator (%) to check if the remainder is zero.
     * 
     * @param year - an integer representing a year.
     * @return - "Yes", "No", or "Not quite!" depending on the input. 
     */
    public String exercise3(int year) { // method w/ public access, return String
        // return null;
        if(year % 4 == 0){
            if((year % 100 == 0) & !(year % 400 == 0)){
                return("Note quite");
            }
            else if((year % 100 == 0) & (year % 400 ==0)){
                return("Yes");
            }
            else{
                return("Yes");
            }
        }
        else{
            return("No");
        }
    }
}
