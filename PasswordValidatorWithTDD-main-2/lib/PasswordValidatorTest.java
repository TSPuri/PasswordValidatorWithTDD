package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String p1 = "123";
        PasswordStrength result1 = PasswordValidator.validate(p1);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 :"+p1+" Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 :"+p1+" Expected INVALID but got " + result1);
        }
        // Test Case 2: รหัสผ่านเป็ฯตัวเลขทั้งหมด 8-16 ตัว
         p1 = "1234567890123456";
         PasswordStrength result2 = PasswordValidator.validate(p1);
         if (result2 == PasswordStrength.WEAK) {
           System.out.println("Test Case 2 :"+p1+" Short password is WEAK.");
         } else {
            System.out.println("Test Case 2 :"+p1+" Expected INVALID but got " + result2);
        }
       //Test Case 3: รหัสผ่านเป็นตัวเล็กทั้งหมด
       p1 = "afskshcs";
       PasswordStrength result3 = PasswordValidator.validate(p1);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 :"+p1+" Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 :"+p1+" Expected INVALID but got " + result3);
        
        }
        //Test Case 4: รหัส ตอนใหญ่+ตัวเล็ก+ตัวเลข
        p1="Pueo1234";
        PasswordStrength result4 = PasswordValidator.validate(p1);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 :"+p1+" Short password is STRONG.");
        } else {
            System.out.println("Test Case 4 :"+p1+" Expected INVALID but got " + result4);
        
        }
        
        //Test Case 5: รหัสzเป็นตัวใหญ่ทั้งหมด
        p1 = "PKSHUEHFIE";
        PasswordStrength result5 = PasswordValidator.validate(p1);
        if (result5 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 5 :"+p1+" Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 5 :"+p1+" Expected INVALID but got " + result5);
        
        }
        

        System.out.println("--------------------------------");
    }
}
