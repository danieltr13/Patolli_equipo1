/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import frames.FrmComoJugar;
import frames.FrmCrearPartida;
import frames.FrmIngresarPartida;
import frames.FrmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Alfonso Sempoalt
 */
public class ControlMnuPrincipal implements ActionListener {

    private FrmPrincipal principal;

    public ControlMnuPrincipal(FrmPrincipal principal) {
        this.principal = principal;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equalsIgnoreCase("CrearPartida")) {
            this.crearPartida();
        } else if (event.getActionCommand().equalsIgnoreCase("Salir")) {
            this.salir();
        } else if (event.getActionCommand().equalsIgnoreCase("Como Jugar")) {
            this.comoJugar();
        } else if (event.getActionCommand().equalsIgnoreCase("Ingresar partida")) {
            this.ingresarPartida();
        }
        
        
        
    }

    private void crearPartida() {
        FrmCrearPartida frmCP = FrmCrearPartida.getInstance();
        frmCP.setVisible(true);
        this.salir();
    }
    
    private void salir(){
        principal.dispose();
    }
    
    private void comoJugar(){
        FrmComoJugar frmCJ = new FrmComoJugar();
        frmCJ.setVisible(true);
        this.salir();
    }
    
    private void ingresarPartida(){
    FrmIngresarPartida frmIP = new FrmIngresarPartida();
        frmIP.setVisible(true);
        this.salir();
    }
}