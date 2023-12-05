package baseball.view;


import baseball.view.printer.Printer;
import baseball.view.reader.Reader;
import baseball.view.validator.InputValidator;

public class InputView {
    private final Reader reader;
    private final Printer printer;
    private final InputValidator validator;

    private InputView(Reader reader, Printer printer, InputValidator validator) {
        this.reader = reader;
        this.printer = printer;
    }

    public static InputView of(Reader reader, Printer printer) {
        return new InputView(reader, printer, InputValidator.getInstance());
    }

    public Template inputTemplate() {
        printer.printLine("");
        String template = reader.readLine();
        validator.validate(template, "템플릿");
        return new Template();
    }
}
