/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import javax.swing.JOptionPane;
import Modelo.Productos;



/**
 *
 * @author astuard
 */
public class ProductosControlBD {
    //Nombre persistence (conexionBaseDatos)
    
    public static boolean agregar(int idProducto, String NombreProducto, float precio, int cantidad ,String categoria ) {
        
        Productos produc = new Productos (idProducto,NombreProducto, precio, cantidad, categoria);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("coneccionDB");
        EntityManager em = emf.createEntityManager();
        ProductosJpaController servicio = new ProductosJpaController(emf);
    //Iniciando transacción 
        em.getTransaction().begin();
        try {
            servicio.create(produc);
            em.getTransaction().commit();
    //Confirmando la transaccion em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
            em.getTransaction().rollback();
            return false;
        }
        em.close();
        emf.close();

        return true;

    }
    
    public static boolean modificar(int idProducto, String NombreProducto, float precio, int cantidad ,String categoria ) {
        Productos produc = new Productos (idProducto,NombreProducto, precio, cantidad, categoria);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("coneccionDB");
        EntityManager em = emf.createEntityManager();
        ProductosJpaController servicio = new ProductosJpaController(emf);
    //Iniciando transacción 
        em.getTransaction().begin();
        try {
            servicio.edit(produc);
            em.getTransaction().commit();
    //Confirmando la transaccion em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
            em.getTransaction().rollback();
            return false;
        }
        em.close();
        emf.close();

        return true;

    }
    
    public static boolean eliminar(int idProducto) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("coneccionDB");
        EntityManager em = emf.createEntityManager();
        ProductosJpaController servicio = new ProductosJpaController(emf);
    //Iniciando transacción 
        em.getTransaction().begin();
        try {
            servicio.destroy(idProducto);
            em.getTransaction().commit();
    //Confirmando la transaccion em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage().toString());
            em.getTransaction().rollback();
            return false;
        }
        em.close();
        emf.close();

        return true;

    }
    
        public static List<Productos> listado() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("coneccionDB");
        EntityManager em = emf.createEntityManager();
        ProductosJpaController servicio = new ProductosJpaController(emf);
        List<Productos> lista = null;
        try {
            lista = servicio.findProductosEntities();
    //Confirmando la transaccion em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }

        em.close();
        emf.close();

        return lista;

    }
    
}
