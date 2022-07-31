public class Mayan extends Language {

    public Mayan(String langName, int langNumSpeakers) {
        super(langName, langNumSpeakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
        System.out.println("Fun fact: " + this.name + " is an ergative language.");
    }


}
