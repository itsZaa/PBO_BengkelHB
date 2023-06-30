package View;

import Controller.ControllerTransaksi;
import javax.swing.JOptionPane;

/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class ViewTotalTransaksi {
    private ControllerTransaksi controllerTransaksi;
    
    public ViewTotalTransaksi(ControllerTransaksi controllerTransaksi){
        this.controllerTransaksi = controllerTransaksi;
    }
    
    public void ViewTotalTransaksi(){
        double total = controllerTransaksi.countIncome();
        JOptionPane.showMessageDialog(null, total);
    }
}