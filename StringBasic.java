import java.util.Scanner;

public class StringBasic {
    public static void main(String args[])
    {
        // Part 1: String concatenation

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String FirstName = input.nextLine();
        System.out.print("Enter your middle name: ");
        String MiddleName = input.nextLine();
        System.out.print("Enter your last name: ");
        String LastName = input.nextLine();

        StringBuilder name = new StringBuilder();
        name.append(FirstName);
        name.append(" ");
        name.append(MiddleName);
        name.append(" ");
        name.append(LastName);
        String result = name.toString();
        System.out.println(result);

        // Part 2: String comparison

        System.out.print("Enter another full name:");
        String FullName = input.nextLine();

        if(result.equalsIgnoreCase(FullName))
        {
            System.out.println("The names are the same.");
        }
        else
        {
            System.out.println("The names are different.");
        }

        // Part 3: String modification

        for(int i = 0; i < result.length(); i++)
        {
            char ch = name.charAt(i);
            if(ch == 'a')
            {
                name.deleteCharAt(i);
                name.insert(i, '@'); 
            }
            else if(ch == 'e')
            {
                name.deleteCharAt(i);
                name.insert(i, '3');
            }
        }
        String ModifiedName = name.toString();
        System.out.println(ModifiedName);

        String UpperCase = result.toUpperCase();
        System.out.println(UpperCase);

        //Part 4: String Splitting

        String[] nameParts = result.split(" ");
        
        // Printing each part of the name
        for (String part : nameParts) {
            System.out.println(part);
        }

        // Part 5: 
        
        System.out.print("Enter a string with spaces at the beginning and the end: ");
        String word = input.nextLine();
        String TrimmedWord = word.trim();
        System.out.println(TrimmedWord);

        // Part 6: Additional Manipulations
        int count = 0;
        for(int i = 0; i < result.length(); i++)
        {
            char c = result.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                count++;
            }
        }
        System.out.println(count);
        
        input.close();
    } 
}
