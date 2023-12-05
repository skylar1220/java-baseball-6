package baseball;

import baseball.controller.BaseBallController;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.view.printer.ConsolePrinter;
import baseball.view.printer.Printer;
import baseball.view.reader.ConsoleReader;
import baseball.view.reader.Reader;

public class Application {
    public static void main(String[] args) {
        Reader reader = new ConsoleReader();
        Printer printer = new ConsolePrinter();

        InputView inputView = InputView.of(reader, printer);
        OutputView outputView = new OutputView(printer);

        BaseBallController baseBallController = new BaseBallController(inputView, outputView);
        baseBallController.run();
    }
}
