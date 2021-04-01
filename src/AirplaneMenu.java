import java.util.Scanner;

public class AirplaneMenu {


    public static void main(String[] args){
        boolean again = true;


        System.out.println("Welcome to Airplane Seating System!");
        while(again){
            Economy economyClass= new Economy();
            FirstClass firstClass= new FirstClass();
            System.out.println("please the number to choose your decision. \n put 1 to chose add passenger; \n put 2 to chose showSeating; \n put 3 to chose quit:");
            Scanner input = new Scanner(System.in);
            String userNumber = input.next();
            if (userNumber.equals("3")) {
                System.out.println("Thank you for your use, hope to serve you again next time!");
                AirplaneMenu.quit();
            }
            else if(userNumber.equals("2")){
                AirplaneMenu.showSeating(economyClass,firstClass);
            }
            else if(userNumber.equals("1")){
                AirplaneMenu.addPassenger();
            }
            else{
                System.out.println("please put the right input!!!\n");
            }
        }

    }
//ok
    public static void quit(){
        System.exit(0);
    }
    //github change
    //prints out economy and first seat arrangement
    public static void showSeating(Economy economyClass,FirstClass firstClass ){
        seats[][] seatF = firstClass.getSeats();
        seats[][] seatE = economyClass.getSeats();
        int before=0;

        System.out.println("Window=[]; Aisle=||.");
        System.out.println("First class:\n");
        clearSeats(seatF,before);
        System.out.print("\n");
        before+=seatF.length;
        System.out.println("Economy class:\n");
        clearSeats(seatE,before);
        before+=seatE.length;
    }
    //this is the columns
    public static String changeToLetter(int x){
        if(x==1){
            return"A";
        }
        if(x==2){
            return"B";
        }
        if(x==3){
            return"C";
        }
        if(x==4){
            return"D";
        }
        if(x==5){
            return"E";
        }
        else{
            return"F";
        }
    }
    //print out the seats
    public static void clearSeats(seats[][]seat, int before){
        for(int i =0; i<seat.length; i++){
            System.out.print("[]"+"\t");
            for(int j=0; j< seat[0].length; j++){
                int row =i+1+before;

                int col =j+1;
                System.out.print(""+row+changeToLetter(col)+"\t");
                if(col*2== seat[0].length){
                    System.out.print("||"+"\t");
                }
            }
            System.out.print("[]"+"\t");
            System.out.print("\n");
        }
    }
    //if person want to be in first or econ then use the assignseat method for that class
    //prior to assign check with the match seat method
    public static void addPassenger(){

    }
}
