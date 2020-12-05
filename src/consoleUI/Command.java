package consoleUI;

/**
 * Η κλάση Command μοντελοποιεί την έννοια της ενέργειας που μπορεί να κάνει (πληκτρολογήσει) ο χρήστης στα μενού.
 * @author Ioannis Baraklilis
 * @author Alexandros Tsingos
 *
 * @version 2020.12.3
 */
public enum Command {
    /**
     * Αντιστοιχεί στην ενέργεια "Εκκίνηση παιχνιδιού".
     */
    BEGIN_GAME("Εκκίνηση παιχνιδιού","Ξεκινάς το παιχνίδι"),

    /**
     * Αντιστοιχεί στην ενέργεια "Έξοδος".
     */
    EXIT_GAME("Έξοδος","Κλείνεις το παιχνίδι"),

    /**
     * Αντιστοιχεί στην ενέργεια "Διαχείριση παίχτη".
     */
    MANAGE_PLAYERS("Διαχείριση παίχτη", "Εισέρχεσαι στο μενού επιλογών Παίχτη"),

    /**
     * Αντιστοιχεί στην ενέργεια "Βοήθεια".
     */
    HELP("Βοήθεια", "Εμφανίζονται εκτενέστερα οι διαθέσιμες ενέργειες"),

    /**
     * Αντιστοιχεί στην ενέργεια "Διαγραφή Παίχτη".
     */
    DELETE_PLAYER("Διαγραφή Παίχτη", "Διαγράφεται η εγγραφή ενός παίχτη απο το παιχνίδι"),

    /**
     * Αντιστοιχεί στην ενέργεια "Δημιουργία παίχτη".
     */
    CREATE_PLAYER("Δημιουργία παίχτη", "Δημιουργείται ένας νέος παίχτης στο παιχνίδι"),

    /**
     * Αντιστοιχεί στην ενέργεια "Μετονομασία παίχτη".
     */
    RENAME_PLAYER("Μετονομασία παίχτη","Αλλάζεις το όνομα του παίχτη"),

    /**
     * Αντιστοιχεί στην ενέργεια "Εμφάνιση πίνακα σκόρ".
     */
    SCOREBOARD("Εμφάνιση πίνακα σκόρ", "Εμφανίζεται ο πίνακας με το τρέχον και μέγιστο σκόρ κάθε παίχτη"),

    /**
     * Αντιστοιχεί στην ενέργεια "Κύριο μενού".
     */
    MAIN_MENU("Κύριο μενού", "Επιστρέφει στο κύριο μενού επιλογών του παιχνιδιού")
    ;

    /**
     *  Η αντίστοιχη ονομασία της εντολής (ενέργειας) στα ελληνικά
     */
    public final String greekName;
    /**
     * Η (ελληνική) περιγραφή της εντολής
     */
    public final String description;

    /**
     * Αντιστοιχίζει το όνομα μίας εντολής και επιστρέφει μία σταθερά Command.
     *
     * Αν δεν υπάρχει αντίστοιχη σταθερά ή δεν αναγνωρίζεται ως αντίστοιχη, τότε επιστρέφεται null.
     *
     * Δεν διακρίνει σε πεζά / κεφαλαία.
     * Επιτρέπει ή πλήρη ή απολύτως ελλειπή τονισμό (για παράδειγμα επιτρέπει διαγραφή παίχτη και διαγραφη παιχτη αλλά όχι διαγραφή παιχτη ή διαγραφη παίχτη).
     *
     * @param name το όνομα μιας εντολής
     * @return η αντίστοιχη σταθερά Command
     */
    public static Command valueOfGreek(String name){
        name = name.toLowerCase(); // Μετατροπή όλων των χαρακτήρων σε πεζά για να μην διακρίνει πεζά / κεφαλαία

        switch (name){ // Αντιστοίχηση συμβολοσειρών σε σταθερές
            case "εκκίνηση παιχνιδιού":
            case "εκκινηση παιχνιδιου": return BEGIN_GAME;

            case "έξοδος":
            case "εξοδος": return EXIT_GAME;

            case "διαχείριση παίχτη":
            case "διαχειριση παιχτη": return MANAGE_PLAYERS;

            case "διαγραφή παίχτη":
            case "διαγραφη παιχτη": return DELETE_PLAYER;

            case "δημιουργία παίχτη":
            case "δημιουργια παιχτη": return CREATE_PLAYER;

            case "μετονομασία παίχτη":
            case "μετονομασια παιχτη": return RENAME_PLAYER;

            case "εμφάνιση πίνακα σκόρ":
            case "εμφανιση πινακα σκορ": return SCOREBOARD;


            case "κύριο μενού":
            case "κυριο μενου": return MAIN_MENU;

            case "βοήθεια":
            case "βοηθεια": return HELP;

            default: return null; // Δεν βρέθηκε αντίστοιχη, επιστρέφεται null.
        }
    }

    /**
     * Ο κατασκευαστής σταθερών της κλάσης Command.
     * Απλά αρχικοποιεί τα πεδία των σταθερών.
     * @param greekName το αντίστοιχο όνομα στα ελληνικά
     * @param description η περιγραφή της σταθεράς (στα ελληνικά)
     */
    Command(String greekName, String description) { // Απλά αντιστοιχίζει τις παραμέτρους σε πεδία
        this.greekName = greekName;
        this.description = description;
    }
}
