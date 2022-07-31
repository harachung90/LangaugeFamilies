public class SinoTibetan extends Language {


    public SinoTibetan(String langName, int langNumSpeakers) {
        super(langName, langNumSpeakers, "Asia", "subject-object-verb");

        if (langName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }
    }
}
