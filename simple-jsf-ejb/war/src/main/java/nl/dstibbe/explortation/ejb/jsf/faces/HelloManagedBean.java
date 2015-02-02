/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dstibbe.explortation.ejb.jsf.faces;

import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import nl.dstibbe.explortation.ejb.jsf.simple.helloejb.HelloEjb;

/**
 *
 * @author dstibbe
 */
@ManagedBean(name = "helloBean")
@SessionScoped
public class HelloManagedBean {

    private static final Logger LOGGER = Logger.getLogger(HelloManagedBean.class.getName());

//    @EJB(mappedName = "myMappedBean")
//    @EJB(beanName = "myEjb")
    @EJB
    private HelloEjb helloEjb;

    public String talk() {
        LOGGER.info("working");
        return "EJB says:  " + helloEjb.talk();
    }

}
