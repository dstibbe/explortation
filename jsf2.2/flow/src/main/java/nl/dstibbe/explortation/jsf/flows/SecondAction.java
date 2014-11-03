package nl.dstibbe.explortation.jsf.flows;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

@Named("secondAction")
@RequestScoped
public class SecondAction implements Serializable {

    private static final XLogger LOGGER = XLoggerFactory.getXLogger(WebForm.class);

    public String execute() {
        LOGGER.entry();

        LOGGER.info("ACTION: SECOND");
        return "YES";
    }
}
