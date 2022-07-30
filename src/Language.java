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

        Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        spanish.getInfo();

    }
}