package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * กฎการให้คะแนนความยากง่ายของ password
     * -หากรหัสผ่านน้อยกว่า 8 ตัวจะให้เป็น INVALID
     * -หากรหัสผ่านมากกว่าหรือเท่ากับ 8 - 16ตัวตัวให้เป็น WEAK
     * -หากรหัสผ่านมากกว่าหรือเท่ากับ 8 ตัวและมีตัวเลข+ตัวอักษรภาษาอังกฤษ(ตัวเล็ก) ให้เป็น MEDIUM
     * -หากรหัสผ่านมากกว่าหรือเท่ากับ 8 ตัวและมีตัวเลข+ตัวอักษรภาษาอังกฤษ(ตัวเล็ก + ตัวใหญ่)ให้เป็น STRONG
     * -หากรหัสผ่านมากว่าหรือเท่ากับ 8 และเป็นตัวอักษรอย่างเดียวตัวเล็ก 
     * -หากรหัสผ่านมากกว่าหรือเท่ากับ 8 และเป็นตัวอักษรอย่างเดียวตัวใหญ๋
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        //int minLength = 8;
        if(password==null || password.length()<8){
            return PasswordStrength.INVALID;
        }
        //if(password.length()>=8 && password.length()<=16)return PasswordStrength.WEAK;
        
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean digit    = false;
        
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c))
               hasLower = true;
               else if(Character.isUpperCase(c))
               hasUpper = true;
        }
        for(int p : password.toCharArray()){
            if(Character.isDigit(p)){
                digit = true;
        }
        
        }
        
        if(digit&&!hasLower&&!hasUpper)return PasswordStrength.WEAK;
        
        if((hasLower && !hasUpper &&!digit)) return PasswordStrength.MEDIUM;
        if((hasUpper && hasLower &&!digit)) return PasswordStrength.MEDIUM;
        if(hasLower && hasUpper && digit) return PasswordStrength.STRONG;
        if(hasUpper &&!hasLower &&!digit)return PasswordStrength.MEDIUM;
        
        //if(password.matches("*.[0-9].*" )&& hasLower &&hasUpper) return PasswordStrength.STRONG;
        
        
         
        return PasswordStrength.INVALID ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}