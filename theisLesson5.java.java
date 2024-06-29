/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 5/24/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC330
Project: Regular Expressions
Description: writing regular expressions that match test data points

 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class theisLesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating strings to test my regular expressions
        String[] testData1 = {"ABCDE^", "APLKS^12345", "ABCDE^^", "LOPSA^12345ANE"};
        String[] testData2 = {"(10) CD-405", "pR*#(-A918c)", "1434OFKA", "0apo-(!020zzz)", "ABVCDE10920"};
        String[] testData3 = {"zyzzz", "zyzyyzzz", "zyzyyzzyzyyzyzzzyyyzz", "zzyyyzzyyzzyyy", "zyyzzzyzzyyzzy", "zzzyz"};
        String largeText = "Four score and 65 years ago Abraham Lincoln was president. He was the sixteenth president of the United States. His achievements in the abolishment of slavery are unparalleled by any president. Compared to the modern day we need a president like him. Instead, our candidates are a wrinkly old man vs an orange wrinkly old man. Congress has become a mockery run by special interests so virtually nothing of importance to the American populace gets passed. Wages aren’t keeping up with inflation, the middle class is being moved into non-existence. Corporations and the rich get richer all while poverty rates rise and government bailouts rise. If our founding fathers or even our 16th president saw where we are now they would cry. Things only got worse when the aliens attacked. Our fearless leader H. G. Wells wrote science fiction and predicted a war between humans and extraterrestrials. A great war was fought and as a result, a world governing body called the League of Nations was formed. It’s funny, America proposed this new deal and America held it up. Among other things, this league never came to fruition. From inaction to member conflicts the League of Nations never became what was envisioned. After World War 2, the United Nations came to address all the League of Nations shortcomings. This new government hid the war aftermath and swept it under the rug to avoid a greater panic in the world populace. It created a borrowing spree. This war was not won, only pretended to be won by the Allies, who were secretly in cahoots with the extraterrestrials. Making money off the war effort and selling to the enemy. This oppression with greed was the downfall of mankind. Many tried to expose this fact and many died trying to do so. Until one day when Hunter S. Thompson came along. He was a journalist who was focused on uncovering the truth. He was able to make a great headway into uncovering the truth. He was able to expose this fake government for what it was. Companies owned by BlackRock and Vanguard that own so much of the market no decision goes without their approval. These players own so many financial markets and sheer volume that their decisions influence government decisions, market trends and the economy in general. Martin Luther King, Jr. helped calm the tides. He was a great man who advocated for the civil rights of others. He was able to negotiate a new arrangement on the behalf of the American populace. He wanted people to judge people on the content of their character, not the color of their skin. This worked, people looked at people differently now and left marginalized communities in better shape and made people believe that we are all humans and that no one is intrinsically better than someone else. However, his success is still doubted by many. Yes, he made huge advances and brought the Civil Rights Act but some people still feel marginalized by society. They still feel marginalized by the color of their skin, the same thing Mr. King set out to change. Regardless of how they feel, we as Americans would not be where we are today without him. Together these four men shaped the world and ended the oppression brought on by the evil government. ";

        // Regular expressions
        //  5 capital letters A-Z, exactly one ‘^’ character, then an optional 5-digitnumber. The input string should not contain any other characters
        String regex1 = "^[A-Z]{5}\\^[0-9]{0,5}$";
        // exactly 8 alphanumeric characters (a-z, A-Z, 0-9) and hyphens in any combination. Any other whitespace or other characters are ignored
        String regex2 = "^[a-zA-Z0-9-]{8}$";
        // begins with the characters ‘zyz’ and ends with ‘zz’
        String regex3 = "^zyz.*zz$";
        // find each of these four names out of a LARGE block of text
        String regex4 = "(Abraham Lincoln|H\\. G\\. Wells|Hunter S\\. Thompson|Martin Luther King, Jr\\.)";

        // Test regex1 
        System.out.println("Testing regex1:");
        // for data in testData see if data matches that in regex1
        for (String data : testData1) {
            System.out.println(data + " : " + data.matches(regex1));
        }

        // Test regex2
        System.out.println("\nTesting regex2:");
        // for data in testData see if data matches that in regex2
        for (String data : testData2) {
            System.out.println(data + " : " + data.matches(regex2));
        }

        // Test regex3
        System.out.println("\nTesting regex3:");
        // for data in testData see if data matches that in regex3
        for (String data : testData3) {
            System.out.println(data + " : " + data.matches(regex3));
        }

        // Test regex4
        System.out.println("\nTesting regex4:");
        // the regex statement is the pattern
        Pattern pattern4 = Pattern.compile(regex4);
        // searches through largeText to fnd the pattern
        Matcher matcher4 = pattern4.matcher(largeText);
        // Interates through all matches found in largeText
        while (matcher4.find()) {
            System.out.println("Found: " + matcher4.group());
        }

        // Close scanner
        scanner.close();
    }
}
