class Solution {
    public boolean strongPasswordCheckerII(String password) {
         if(password.length()<8) return false;
         boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if ("!@#$%^&*()-+".indexOf(ch) >= 0) hasSpecial = true;

            if (i > 0 && ch == password.charAt(i - 1)) return false;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}