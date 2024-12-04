public class Patient {
    private int id ;
    private String name ;
    private int birthYear ;
    private double height;//average height
    private double weight;//average weight
    private String bloodGroup;//กันบัคจาก Group AB
    private String phoneNumber;
    public Patient(int id,String name,int birthYear,double height,double weight,String bloodGroup,String phoneNumber){
        if(height < 0) {//แก้ case ติดลบ
            System.out.println("Error height input\n");
        }
        if(weight < 0) {//แก้ case ติดลบ
            System.out.println("Error weight input\n");
        }
     /*if( height < 50 || height > 300 ){ //ความสูงไม่ใช่มนุษย์ ใช้ค่าเฉลี่ย
         height = 170;
         System.out.println("Error height input");
     }
     if( weight < 2 || weight > 1000 ) { //น้ำหนักไม่ใช่มนุษย์ ใช้ค่าเฉลี่ย
         weight = 65;
         System.out.println("Error weight input");
     }*/
        if(id > 0 && birthYear > 0){
            this.id = id;
            this.name = name;
            this.birthYear = birthYear;
            this.height = height;
            this.weight = weight;
            this.bloodGroup = bloodGroup;
            this.phoneNumber = phoneNumber;
        }
        else{
            System.out.println("Error Input");
        }
    }
    public int getid(){
        return this.id ;
    }
    public String getname(){
        return this.name ;
    }
    public int getbirthYear(){
        return this.birthYear ;
    }
    public double getheight(){//แก้ไขบัคติดลบที่นี่
        if(height < 0) return -1*this.height;
        if( height < 50 || height > 300 ){ //ความสูงไม่ใช่มนุษย์ ใช้ค่าเฉลี่ย
            return 170;
        }else{
            return this.height;
        }
    }
    public double getweight(){
        if(weight < 0) return -1*this.weight;
        if( weight < 2 || weight > 1000 ) { //น้ำหนักไม่ใช่มนุษย์ ใช้ค่าเฉลี่ย
            return 70;
        }else{
            return this.weight;
        }
    }
    public String getbloodgroup(){
        if(bloodGroup.equals("A") || bloodGroup.equals("B") || bloodGroup.equals("AB") || bloodGroup.equals("O")){
            return this.bloodGroup ;
        }else{
            return "Unknown";
        }//

    }
    public String getphonenumber(){
        return this.phoneNumber ;
    }
    public int getAge(int currentYear){
        if(currentYear >= this.birthYear){
            return currentYear - this.birthYear;
        }
        else{
            System.out.println("Error Input Year");
            return 0;
        }
    }
    public double getBMI(){
        if(this.height > 0 && this.weight > 0){
            return this.weight/(this.height*this.height*0.01*0.01);
        }else{
            return 0.0;
        }
    }
    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + getheight());
        System.out.println("Patient Weight (kg): " + getweight());
        System.out.println("Patient bloodgroup : " + getbloodgroup());
        System.out.println("Patient phonenumber: " + getphonenumber());
        System.out.println("BMI : "+getBMI()+"\n");
    }

}