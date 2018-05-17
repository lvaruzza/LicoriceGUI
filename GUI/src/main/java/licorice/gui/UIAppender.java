package licorice.gui;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;

public class UIAppender extends AppenderBase<ILoggingEvent> {
    private static MainPanel main;

    public static void setMainPanel(MainPanel main) {
        UIAppender.main = main;
    }

    @Override
    protected void append(ILoggingEvent event) {
        main.appendLog(event.getMessage() + "\n\n");
    }
}
