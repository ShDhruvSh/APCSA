/**
 * SortedFlashCards
 * This program defines the SortedFlashCards class.
 * Authors: Dhruv Sharma
 * Date: 2/27/2020
 * On My Honor: DS
 * Other classes I have written that would benefit from protected: Clock + MilitaryClock and Rectangle + GoldenRectangle
 **/

public class SortedFlashCards extends FlashCards
{

    /* initialize instance data: arrays with a length of 1, and numCards to 0; uses super class constructor */
    public SortedFlashCards()
    {
        super();
    }

    /* add cards in sorted, alphabetical order of questions */
    public void addCard(String question, String answer)
    {
        int i;
        if(numCards == myQuestions.length)
        {
            doubleArrayLengths();
        }

        int insert = numCards;

        //sorting questions
        for(i = 0; i < numCards; i++)
        {
            if (myQuestions[i].compareTo(question) > 0)
            {
                insert = i;
                break;
            }
        }


        for(i = numCards; i > insert; i--)
        {
            myQuestions[i] = myQuestions[i-1];
            myAnswers[i] = myAnswers[i-1]; //have to sort answers according to questions
        }

        myQuestions[insert] = question;
        myAnswers[insert] = answer;

        numCards++;
    }
}
