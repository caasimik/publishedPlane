public class Plane {

    private seats[][] seat; // an 2d array of seats
    private int maxRow; // max amount of rows
    private int maxCol; // max amount of columns
    //constructor to design amount of seats
    public Plane(int row, int col){
        seat = new seats[row][col];
    }
    //show seating method?
    public seats[][] getSeats(){
        return seat;
    }
    //
    public void assignSeats(){
        // not done
    }

    public void matchSeats(){
        // not done
    }

    public int getMaxRow(){
        return maxRow;
    }

    public int getMaxCol(){
        return maxCol;
    }
}
