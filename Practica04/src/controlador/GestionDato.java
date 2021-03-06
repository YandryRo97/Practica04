/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Equipo;
import modelo.Estadio;
import modelo.Grupo;
import modelo.Jugador;
import modelo.Pais;
import modelo.Torneo;

/**
 *
 * @author PC-MATIC
 */
public class GestionDato 
{
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Practica04PU");
    private List<Equipo> equipoList;
    private List<Pais> paisList;
    private List<Torneo> torneoList;
    private List<Estadio> estadioList;
    private List<Grupo> grupoList;
    private List<Jugador> jugadorList;

    public GestionDato(List<Equipo> equipoList, List<Pais> paisList, List<Torneo> torneoList, List<Estadio> estadioList, List<Grupo> grupoList, List<Jugador> jugadorList) {
        this.equipoList = equipoList;
        this.paisList = paisList;
        this.torneoList = torneoList;
        this.estadioList = estadioList;
        this.grupoList = grupoList;
        this.jugadorList = jugadorList;
    }
   
    
    
    public boolean persistirEquipo(Equipo e) {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
     
    public List<Equipo> leerEquipo() {
        List<Equipo> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT e FROM Equipo e ORDER BY e.id").getResultList();        
        em.close();
        return retorno;
    }
     
     
    public boolean actualizarEquipo(Equipo e) {  
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }

    public Equipo buscarEquipo(int i) {
        Equipo retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Equipo.class, i);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }

    public boolean eliminarEquipo(Equipo e) {        
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.remove(em.merge(e));
            em.getTransaction().commit();
            retorno=true;
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
   
///////////////////////////////////////////////////////////////////
    
    
    public boolean persistirPais(Pais p) {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
     
    public List<Pais> leerPais() {
        List<Pais> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT e FROM Equipo e ORDER BY e.id").getResultList();        
        em.close();
        return retorno;
    }
     
     
    public boolean actualizarPais(Pais p) {  
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }

    public Pais buscarPais(int i) {
        Pais retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Pais.class, i);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }

    public boolean eliminarPais(Pais p) {        
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.remove(em.merge(p));
            em.getTransaction().commit();
            retorno=true;
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    
     public boolean persistirGrupo(Grupo g) {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
     
    public List<Grupo> leerGrupo() {
        List<Grupo> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT e FROM Equipo e ORDER BY e.id").getResultList();        
        em.close();
        return retorno;
    }
     
     
    public boolean actualizarGrupo(Grupo g) {  
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(g);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }

    public Grupo buscarGrupo(int i) {
        Grupo retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Grupo.class, i);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }

    public boolean eliminarGrupo(Grupo g) {        
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.remove(em.merge(g));
            em.getTransaction().commit();
            retorno=true;
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
    ////////////////////////////////////////////////////////////////////////////////
    
     public boolean persistirJugador(Jugador j) {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(j);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
     
    public List<Jugador> leerJugador() {
        List<Jugador> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT e FROM Equipo e ORDER BY e.id").getResultList();        
        em.close();
        return retorno;
    }
     
     
    public boolean actualizarJugador(Jugador j) {  
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(j);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }

    public Jugador buscarJugador(int i) {
        Jugador retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Jugador.class, i);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }

    public boolean eliminarJugador(Jugador j) {        
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.remove(em.merge(j));
            em.getTransaction().commit();
            retorno=true;
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
    ////////////////////////////////////////////////////////////////////////////
    
    public boolean persistirEstadio(Estadio e) {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
     
    public List<Estadio> leerEstadio() {
        List<Estadio> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT e FROM Equipo e ORDER BY e.id").getResultList();        
        em.close();
        return retorno;
    }
     
     
    public boolean actualizarEstadio(Estadio e) {  
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }

    public Estadio buscarEstadio(int i) {
        Estadio retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Estadio.class, i);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }

    public boolean eliminarEstadio(Estadio e) {        
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.remove(em.merge(e));
            em.getTransaction().commit();
            retorno=true;
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
    ///////////////////////////////////////////////////////////////////////////
    
    public boolean persistirTorneo(Torneo t) {
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }
     
    public List<Torneo> leerTorneo() {
        List<Torneo> retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        retorno=em.createQuery("SELECT e FROM Equipo e ORDER BY e.id").getResultList();        
        em.close();
        return retorno;
    }
     
     
    public boolean actualizarTorneo(Torneo t) {  
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
        em.close();
        retorno=true;
        return retorno;
    }

    public Torneo buscarTorneo(int i) {
        Torneo retorno=null;        
        EntityManager em = this.emf.createEntityManager();
        try
        {
            retorno=em.find(Torneo.class, i);
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }

    public boolean eliminarTorneo(Torneo t) {        
        boolean retorno=false;
        EntityManager em = this.emf.createEntityManager();
        try
        {
            em.getTransaction().begin();
            em.remove(em.merge(t));
            em.getTransaction().commit();
            retorno=true;
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        finally
        {
            em.close();
        }
        return retorno;
    }
   
    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    public List<Pais> getPaisList() {
        return paisList;
    }

    public void setPaisList(List<Pais> paisList) {
        this.paisList = paisList;
    }

    public List<Torneo> getTorneoList() {
        return torneoList;
    }

    public void setTorneoList(List<Torneo> torneoList) {
        this.torneoList = torneoList;
    }

    public List<Estadio> getEstadioList() {
        return estadioList;
    }

    public void setEstadioList(List<Estadio> estadioList) {
        this.estadioList = estadioList;
    }

    public List<Grupo> getGrupoList() {
        return grupoList;
    }

    public void setGrupoList(List<Grupo> grupoList) {
        this.grupoList = grupoList;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }
}
