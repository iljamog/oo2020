/**
 * PersonalCode
 */
public class PersonalCode {

    private String code = "39506070833";


    public static void main(String[] args) {
        PersonalCode myCode = new PersonalCode();
        myCode.code = "49506070833";
        System.out.println(myCode.gender());
    }    

    String gender(){
        int FirstNumber = Integer.parseInt(code.substring(0, 1));
        String gender;
        if (FirstNumber % 2 == 0) {
            gender = "Female";
        } else {
            gender = "Male";
        }
        return gender;            
    }

    public int getAge(){
        int ageYear = (Integer.parseInt(code.substring(1,3)) + 1900);
        int ageMonth = Integer.parseInt(code.substring(3,5));
        int ageDay = Integer.parseInt(code.substring(5,7));

        return "PersonalCode(ageDay, ageMonth, ageYear)";   
    }
    
    public String toString(){
        return "TERE";
    }
    

    String getCode(){
        return this.code;
    }

    void setCode(String code){
        this.code = code;
    }
}