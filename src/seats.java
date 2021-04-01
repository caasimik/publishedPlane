public class seats {

    private int pref; // 1 - window, 2 - center, 3 - aisle
    private boolean state = false; // occupied or not
    public seats(int pref){
        this.pref = pref;
    }

    public String getPref(){
        if (pref == 1) {
            return "window";
        } else if(pref == 2) {
            return "center";
        }
        return "aisle";
    }

    public void setState(boolean state){
        this.state = state;
    }

    public boolean getState(){
        return state;
    }
}
