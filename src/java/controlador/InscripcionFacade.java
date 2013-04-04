/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import persistencia.Inscripcion;

/**
 *
 * @author casa
 */
@Stateless
public class InscripcionFacade extends AbstractFacade<Inscripcion> {
    @PersistenceContext(unitName = "GimparoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InscripcionFacade() {
        super(Inscripcion.class);
    }
    
}
