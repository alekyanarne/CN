import java.util.Scanner;
 
public class SubstitutionCipher{
	public static void encrypt(String message, int key){
		String encryptedMessage = "";
		char ch;
		for(int i = 0; i < message.length(); i++){
			ch = message.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){
            			ch = (char)(ch + key);
            			if(ch > 'z'){
                			ch = (char)(ch - 'z' + 'a' - 1);
            			}
            
           		}
        		else if(ch >= 'A' && ch <= 'Z'){
            			ch = (char)(ch + key);
           	 		if(ch > 'Z'){
                			ch = (char)(ch - 'Z' + 'A' - 1);
            			}
            
			}
         		encryptedMessage += ch;
         	}
        	System.out.println("Encrypted Message = " + encryptedMessage);

	}
	
	public static void decrypt(String message, int key){
		String decryptedMessage = "";
		char ch;
		for(int i = 0; i < message.length(); ++i){
			ch = message.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
            			ch = (char)(ch - key);
            			if(ch < 'a'){
                			ch = (char)(ch + 'z' - 'a' + 1);
            			}
        		}
        		else if(ch >= 'A' && ch <= 'Z'){
            			ch = (char)(ch - key);
            			if(ch < 'A'){
                			ch = (char)(ch + 'Z' - 'A' + 1);
            			}
        		}
      		
         		decryptedMessage += ch;
        
        	}
        
		System.out.println("Decrypted Message = " + decryptedMessage);

	}
	
	public static void main(String[] args){
		int choice, key;
		String message; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a message: ");	
		message = sc.nextLine();
		System.out.println("Enter key: ");
		key = sc.nextInt();
		System.out.println("1. Encryption 2. Decryption");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		if(choice == 1){
			encrypt(message, key);
		}
		else{
			decrypt(message, key);
		}
	}
	
}
