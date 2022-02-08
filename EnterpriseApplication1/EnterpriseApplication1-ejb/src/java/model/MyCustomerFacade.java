/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author shing
 */
@Stateless
public class MyCustomerFacade extends AbstractFacade<MyCustomer> {

	@PersistenceContext(unitName = "EnterpriseApplication1-ejbPU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public MyCustomerFacade() {
		super(MyCustomer.class);
	}

}
