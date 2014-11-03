package nl.dstibbe.explortation.jsf.flows;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

@Named("thirdAction")
@RequestScoped
public class ThirdAction implements Serializable {

    public static enum STATES {

        SUCCESS, FAILURE
    };

    private static final XLogger LOGGER = XLoggerFactory.getXLogger(WebForm.class);

    public String execute() {
        LOGGER.entry();

        LOGGER.info("ACTION: THIRD");
        return STATES.SUCCESS.name();
    }
}
