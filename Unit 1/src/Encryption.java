/**
 * Encryption
 * This program encrypts a word by replacing each letter with another letter n letters away.
 * Authors: Dhruv Sharma
 * Date: 9/4/2019
 * On My Honor: DS
 **/
public class Encryption {
    public static void main(String[] args) {
        //assigning char the original letter values
        char first = 'd';
        char second = 'o';
        char third = 'g';
        int n = 500;

        //redefining n to be something under 26
        n = n%26;


        //the encryption: changing the original letter to "original letter + n"th letter
        first = (char) (first + n);
        second = (char) (second + n);
        third = (char) (third + n);

        //if the char is > z, then it must wrap itself, i.e. subtract 26 characters
        if (first > 'z')
        {
            first = (char) (first - 26);
        }

        if (second > 'z')
        {
            second = (char) (second - 26);
        }

        if (third > 'z')
        {
            third = (char) (third - 26);
        }

        System.out.print(first);
        System.out.print(second);
        System.out.print(third);

    }
}
