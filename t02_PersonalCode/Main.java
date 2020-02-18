/**
 * PersonalCode
 */
public class Main {

    String code = "39506070833";
    public static void main(String[] args) {
        PersonalCode iljaCode = new PersonalCode();
        iljaCode.setCode("49506070833");
        System.out.println(iljaCode.getCode());
        System.out.println(iljaCode.gender());

        System.out.println(iljaCode.getAge());
    }    


}