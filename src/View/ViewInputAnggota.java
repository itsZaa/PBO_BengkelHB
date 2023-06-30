package View;
import Controller.ControllerAnggota;
import javax.swing.JOptionPane;
/**
 *
 * @author 1122015 - Gregorius Reza
 */
public class ViewInputAnggota {
    private ControllerAnggota controller;

    public ViewInputAnggota(ControllerAnggota controller) {
        this.controller = controller;
    }
    
    public void ViewAddAnggota () {
        String nama = JOptionPane.showInputDialog(null,"Input Nama");
        String alamat = JOptionPane.showInputDialog(null,"Input Alamat");
        String nomorTelepon = JOptionPane.showInputDialog(null,"Input Nomor Telepon");
        String email = JOptionPane.showInputDialog(null,"Input Email");
        controller.addAnggota(nama, alamat, nomorTelepon, email);
    }
    
}
