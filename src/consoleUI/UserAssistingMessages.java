package consoleUI;

import internals.round.Round;

/**
 * Η κλάση UserAssistingMessages αποτελεί βοηθητική κλάση και παρέχει ένα σύνολο στατικών μεθόδων που επιτρέπουν στην εφαρμογή να τυπώνει βοηθητικά μηνύματα
 * σχετικά με την τρέχουσα κατάσταση του παιχνιδιού προς τον χρήστη
 *
 * @author Ioannis Baraklilis
 * @author Alexandros Tsingos
 *
 * @version 2020.11.29
 */
public class UserAssistingMessages {

    /**
     * Η κλάση περιέχει μόνο στατικές μεθόδους, επομένως δεν συνίσταται η δημιουργία αντικειμένου της.
     */
    public UserAssistingMessages(){

    }

    /**
     * Τυπώνει τον πίνακα με τις ενέργειες που μπορεί να επιλέξει ο χρήστης εντός γραφικών διαχωριστικών.
     *
     * Τα στοιχεία του πίνακα είναι αντικείμενα της κλάσης Command και τα γραφικά διαχωριστικά αποτελούνται απο τον χαρακτήρα '-'.
     *
     * Εντός τού γραφικού διαχωριστικού πριν την εκτύπωση των στοιχείων περιέχεται και ο τίτλος του πίνακα.
     *
     * Πριν κάθε στοιχείο του πίνακα τυπώνεται το σύμβολο '*'.
     *
     * @param commands ο πίνακας με τις ενέργειες
     */
    public static void printCommandMenu(Command[] commands){
        System.out.println("-----   Διαθέσιμες Ενέργειες   -----"); // Διαχωριστικό πριν τα στοιχεία του πίνακα που περιέχει τον τίτλο.
        for(Command c : commands){
            System.out.println("\t* " + c.greekName); // Εκτύπωση όλων των στοιχείων του πίνακα (ονομάτων εντολών - ενεργειών χρήστη στα ελληνικά) μετά το σύμβολο '*'.
        }
        System.out.println("------------------------------------"); // Διαχωριστικό μετά τα στοιχεία του πίνακα
    }

    /**
     * Τυπώνει τον πίνακα με τις ενέργειες που μπορεί να επιλέξει ο χρήστης και την περιγραφή τους εντός γραφικών διαχωριστικών.
     *
     * Τα στοιχεία τον πίνακα είναι αντικείμενα της κλάσης Command και τα γραφικά διαχωριστικά αποτελούνται απο τον χαρακτήρα '-'.
     *
     * Εντός τού γραφικού διαχωριστικού πριν την εκτύπωση των στοιχείων περιέχεται και ο τίτλος τον πίνακα.
     *
     * Πριν κάθε στοιχείο τον πίνακα τυπώνεται το σύμβολο '*'.
     *
     * @param commands ο πίνακας με τις ενέργειες
     */
    public static void printHelpMenu(Command[] commands){
        System.out.println("-----   Διαθέσιμες Ενέργειες   -----"); // Διαχωριστικό πριν τα στοιχεία τον πίνακα που περιέχει τον τίτλο.
        for(Command c : commands){
            // Εκτύπωση όλων των στοιχείων τον πίνακα (ονομάτων και περιγραφές εντολών - ενεργειών χρήστη στα ελληνικά) μετά το σύμβολο '*'.
            System.out.println("\t* " + c.greekName + ":\t" + c.description);
        }
        System.out.println("------------------------------------"); // Διαχωριστικό μετά τα στοιχεία τον πίνακα
    }


    /**
     * Τυπώνει το αποτέλεσμα της απάντησης του παίχτη.
     *
     * Το αποτέλεσμα είναι επιτυχία αν gain {@code >} 0, αποτυχία σε διαφορετική περίπτωση.
     * Επίσης, αν κέρδισε τυπώνει το σύνολο των πόντων που κέρδισε ο παίχτης, ενώ αν έχασε τυπώνει την σωστή απάντηση.
     *
     * @param gain το σύνολο των πόντων που κέρδισε / έχασε ο παίχτης
     * @param rightAnswer η σωστή απάντηση στην ερώτηση
     */
    public static void printGain(int gain, String rightAnswer){
        if (gain>0) { // Επιτυχής απάντηση
            System.out.println("Σωστή Απάντηση!");
            System.out.printf("Κέρδισες %d πόντους!%n", gain);
        }
        else { // Ανεπιτυχής απάντηση
            System.out.println("Λάθος απάντηση...");
            System.out.printf("Η σωστή ήταν η \"%s\"%n", rightAnswer);
        }
    }

    /**
     * Τυπώνει πληροφορίες σχετικά με τον γύρο.
     *
     * Τυπώνει το όνομα του γύρου και την περιγραφή του.
     *
     * @param aRound ο γύρος του οποίου οι πληροφορίες θα τυπωθούν
     */
    public static void printRoundInfo(Round aRound){
        System.out.println("Αυτός ο γύρος είναι ο:");
        System.out.println(aRound.getRoundName()); // Λήψη και εκτύπωση ονόματος γύρου
        System.out.println();
        System.out.println("Περιγραφή:");
        System.out.println(aRound.getRoundDescription()); // Λήψη και εκτύπωση περιγραφής γύρου
    }

    /**
     * Τυπώνει πληροφορίες για την τρέχουσα ερώτηση.
     *
     * Τυπώνει την εκφώνηση της ερώτησης καθώς και τις πιθανές απαντήσεις της.
     *
     * @param roundQuestion η εκφώνηση της ερώτησης
     * @param validAnswers πιθανές απαντήσεις της ερώτησης
     */
    public static void printQuestion(String roundQuestion, String[] validAnswers){
        System.out.println(roundQuestion); // Εκτύπωση εκφώνησης ερώτησης
        System.out.println();
        for (int i=0; i<validAnswers.length; i++){
            System.out.println((i+1)+"." +validAnswers[i]); // Εκτύπωση κάθε μίας απο τις πιθανές απαντήσεις

        }
    }

    /**
     * Τυπώνει τον πίνακα που δίνεται ως παράμετρος εντός γραφικών διαχωριστικών.
     *
     * Τα γραφικά διαχωριστικά αποτελούνται απο τον χαρακτήρα '-'.
     *
     * Εντός τού γραφικού διαχωριστικού πριν την εκτύπωση περιέχεται και ο τίτλος τον πίνακα.
     *
     * Πριν κάθε στοιχείο τον πίνακα τυπώνεται το σύμβολο '*'
     *
     * @param listLabel ο τίτλος τον πίνακα
     * @param listContents ο πίνακας με τα στοιχεία τον πίνακα
     */
    public static void printList(String listLabel, String[] listContents){
        System.out.printf("-----   %s   -----%n", listLabel); // Διαχωριστικό πριν τα στοιχεία τον πίνακα που περιέχει τον τίτλο.
        for (String aListElement : listContents) {
            System.out.println("\t* " + aListElement); // Εκτύπωση στοιχείων πίνακα μετά απο τον χαρακτήρα '*'
        }
        System.out.printf("--------%s--------%n", "-".repeat(listLabel.length())); // Διαχωριστικό μετά τα στοιχεία τον πίνακα
    }

}
