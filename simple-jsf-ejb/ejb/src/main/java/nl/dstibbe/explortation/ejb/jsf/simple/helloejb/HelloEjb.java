/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dstibbe.explortation.ejb.jsf.simple.helloejb;

import javax.ejb.Local;

/**
 *
 * @author dstibbe
 */
@Local
public interface HelloEjb {

    String talk();
}
