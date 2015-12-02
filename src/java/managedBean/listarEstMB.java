/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import entidad.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import sesion.EstudianteFacade;

/**
 *
 * @author chakra
 */
public class listarEstMB {

    /**
     * Creates a new instance of listarEstMB
     */
    public listarEstMB() {
    }
    @EJB
    private EstudianteFacade estudianteFacade;

    List<Estudiante> listaClientes = new ArrayList<>();
    Estudiante clienteActual;

    public List<Estudiante> getListaClientes() {
        return estudianteFacade.buscarTodos();
    }

    public Estudiante getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(Estudiante clienteActual) {
        listaClientes.add(clienteActual);
    }

    public String reinit() {
        clienteActual = new Estudiante();
        return null;
    }
}
