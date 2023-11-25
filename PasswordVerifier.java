/**
   The PasswordVerifier class stores data about a password
   for the Password Verifier programming challenge.
*/

public class PasswordVerifier
{
   // Minimum password length
   private static final int MIN_PASSWORD_LENGTH = 6;
   
   /**
      The isValid method determines whether a password is
      valid or not.
      @param str A string to test as a password.
      @return true if the string contains a valid password,
              false otherwise.
   */
   
   public static boolean isValid(String str)
   {
       boolean isValid = true;
     if (str != null && str.length() < MIN_PASSWORD_LENGTH)
     {
       isValid = false;
     }
     else
     {
       if(!hasUpperCase(str))
       {
         isValid = false;
       }
       if(!hasLowerCase(str))
       {
         isValid = false;
       }
     }
     if (!hasDigit(str))
     {
       isValid = false;
     }
     return isValid;
   }

   /**
      The hasUpperCase method determines whether a string
      has at least one uppercase character.
      @param str A string to test.
      @return true if the string contains an uppercase character,
              false otherwise.
   */
      
   private static boolean hasUpperCase(String str)
   {
      for (char ch : str.toCharArray())
        {
          if (Character.isUpperCase(ch))
          {
            return true;
          }
        }
     return false;
   }

   /**
      The hasLowerCase method determines whether a string
      has at least one lowercase character.
      @param str A string to test.
      @return true if the string contains an lowercase character,
              false otherwise.
   */
   
   private static boolean hasLowerCase(String str)
   {
      for (char ch : str.toCharArray())
        {
          if (Character.isLowerCase(ch))
          {
            return true;
          }
        }
      return false;
   }

   /**
      The hasDigit method determines whether a string
      has at least one numeric digit.
      @param str A string to test.
      @return true if the string contains a numeric digit,
              false otherwise.
   */
         
   private static boolean hasDigit(String str)
   {
     for (char ch : str.toCharArray())
       {
         if (Character.isDigit(ch))
         {
           return true;
         }
       }
       return false; 
   }
}
