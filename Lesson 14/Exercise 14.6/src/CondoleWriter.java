public class CondoleWriter implements Printer, Notifier {

    // override greeting method according
    @Override
    public void greeting() {
        Printer.super.greeting();
        Notifier.super.greeting();
    }
}


/**
 * Resolve a diamond problem of ConsoleWriter class. Override greeting method
 * according to Printer interface implementation. Try to avoid code duplication.
 */