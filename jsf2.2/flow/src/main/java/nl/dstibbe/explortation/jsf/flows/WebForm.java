package nl.dstibbe.explortation.jsf.flows;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;

@Named("webForm")
@RequestScoped
public class WebForm implements Serializable {

    private static final XLogger LOGGER = XLoggerFactory.getXLogger(WebForm.class);

    public String submit() {
        LOGGER.entry();
        LOGGER.info("FORM ACTION: submit");
        return "SUCCESS";
    }
}
