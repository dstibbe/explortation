/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dstibbe.explortation.ejb.jsf.simple.helloejb;

import javax.ejb.Stateless;

/**
 *
 * @author martin
 */
//@Stateless(name = "myEjb", mappedName = "myMappedBean")
@Stateless
public class HelloEjbBean implements HelloEjb {

    @Override
    public String talk() {
        return "I'm alive!!! and hello.";
    }
}
