import java.util.ArrayList;

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;

    public Language(String langName, int langNumSpeakers, String langRegionSpoken, String langWordOrder) {
        this.name = langName;
        this.numSpeakers = langNumSpeakers;
        this.regionSpoken = langRegionSpoken;
        this.wordOrder = langWordOrder;
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
    }

    public static void main(String[] args) {

        // testing out Language class by instantiating a language
        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        //spanish.getInfo(); // Don't need this as we have a for-each loop below

        // testing out Mayan class by instantiating a Mayan language
        Mayan tzeltal = new Mayan("Tzeltal", 445856);
        //tzeltal.getInfo(); // Don't need this as we have a for-each loop below

        // testing out Sino-Tibetan class by instantiating two Sino-Tibetan languages
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        SinoTibetan burmese = new SinoTibetan("Burmese",43000000);

        //mandarin.getInfo(); // Don't need this as we have a for-each loop below
        //burmese.getInfo(); // Don't need this as we have a for-each loop below

        ArrayList<Language> languages = new ArrayList<Language>();
        languages.add(spanish);
        languages.add(tzeltal);
        languages.add(mandarin);
        languages.add(burmese);

        for (Language language : languages) {
            language.getInfo();
        }
    }
}