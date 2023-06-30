
package View;

import Controller.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 1122015 - GregoriusReza
 */
public class ViewMain {
    private ControllerAnggota controller1;
    private ControllerTransaksi controller2;
    private ViewInputAnggota view1;
    private ViewInputTransaksi view2;
    private ViewTotalTransaksi view3;
    
    public ViewMain(ControllerAnggota controllerAnggota, ControllerTransaksi controllerTransaksi){
        this.controller1 = controllerAnggota;
        this.controller2 = controllerTransaksi;
        this.view1 = new ViewInputAnggota(this.controller1);
        this.view2 = new ViewInputTransaksi(this.controller2, this.controller1);
        this.view3 = new ViewTotalTransaksi(this.controller2);
    }
    public void displayMainMenu(){
        int menu = -1;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Input Anggota\n2. Input Transaksi\n3.countTotalTransaski\n0. Exit\ninput menu :"));
            if (menu == 1) {
                view1.ViewAddAnggota();
            } else if (menu == 2) {
                view2.ViewCreateTransaksi();
            } else if (menu == 3) {
                view3.ViewTotalTransaksi();
            }else if (menu == 0){
                
            } else {
                JOptionPane.showMessageDialog(null, "Menu Salah");
            }
        } while (menu != 0);
    }
}
