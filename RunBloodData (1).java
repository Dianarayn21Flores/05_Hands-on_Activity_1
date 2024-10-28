import java.util.Scanner;

class BloodData {

    private String bloodType; 
    private String rhFactor;   

    
    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    
    public BloodData(String bt, String rh) {
        this.bloodType = bt;
        this.rhFactor = rh;
    }

    
    public String getBloodType() {
        return bloodType;
    }

    
    public void setBloodType(String bloodtype) {
        this.bloodType = bloodtype;
    }

   
    public String getRhFactor() {
        return rhFactor;
    }

    
    public void setRhFactor(String rhfactor) {
        this.rhFactor = rhfactor;
    }

    
    public void display() {
        System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank");
    }
}

public class RunBloodData {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BloodData bd = new BloodData();

        
        System.out.print("Enter blood type of patient: ");
        bd.setBloodType(sc.nextLine());

        
        System.out.print("Enter Rhesus Factor (+ or -): ");
        bd.setRhFactor(sc.nextLine());

        System.out.println();
        bd.display(); 
        System.out.println();

        sc.close(); 
    }
}