/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import persistencia.Actividad;

/**
 *
 * @author casa
 */
@Stateless
public class ActividadFacade extends AbstractFacade<Actividad> {
    @PersistenceContext(unitName = "GimparoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ActividadFacade() {
        super(Actividad.class);
    }
    
}
