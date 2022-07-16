public class Main {
    public static void main(String[] args) {
        SpeakingEntity englishSpeakingPerson = (SpeakingEntity) new SpeakingEnglish();
        englishSpeakingPerson.sayHello();
        englishSpeakingPerson.sayBye();
    }
}