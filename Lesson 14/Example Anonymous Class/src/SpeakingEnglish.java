public class SpeakingEnglish implements SpeakingEntity {
    SpeakingEntity englishSpeakingPerson = new SpeakingEntity() {
        @Override
        public void sayHello() {

        }

        @Override
        public void sayBye() {

        }
    };


    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye!");
    }
}
