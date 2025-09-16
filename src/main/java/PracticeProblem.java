public class PracticeProblem {

    public static void main(String args[]) {

    }

    //Question 1
    public static String evenOrOdd(int int1) {
        if (int1 % 2 == 0) {
            return("Even");
        } 
        else { 
            return("Odd"); 
        }
    }
    //Question 2
    public static String teacherOrStudent(String string1) {
        if (string1 == "Kalisz") {
            return("Teacher");
        }
        else {
            return("Student");
        }
        }
    //Question 3
    public static int fartherFromZero(int integer1) {
        if (integer1 > 0) {
            return(integer1 + 5); }
        else if (integer1 < 0) {
            return (integer1 - 5); }
        else if (integer1 == 0) {
            return(0); }
        return integer1;
        }
    //Question 4
    public static String isFive(int q4) {
        if (q4 == 5) {
            return("The number is Five"); }
        else {
            return("The number is not Five"); }
        }
    //Question 5
    public static String positiveOrNegative(double q5) {
        if (q5 > 0) {
            return("Positive"); }
        else {
            return("Negative"); }
        }
    //Question 6
    public static String highOrLow(int q6) {
        if (q6 > 100) {
            return("High"); }
        else {
            return("Low"); }
        }
    //Question 7
    public static String isHello(String q7) {
        if (q7 == "Hello") {
            return("The word is Hello"); }
        else {
            return("The word is not Hello"); }
        }
}