package View;

import Controller.ControllerAnggota;
import Controller.ControllerTransaksi;
import Model.Barang;
import Model.JenisPembayaran;
import Model.Keranjang;
import Model.Layanan;
import javax.swing.JOptionPane;

/**
 * View class for inputting a new transaction.
 * Handles user input and displays transaction details.
 */
public class ViewInputTransaksi {
    private ControllerTransaksi controllerTransaksi;
    private ControllerAnggota controllerAnggota;
    
    public ViewInputTransaksi(ControllerTransaksi controllerTransaksi, ControllerAnggota controllerAnggota) {
        this.controllerTransaksi = controllerTransaksi;
        this.controllerAnggota = controllerAnggota;
    }
    
    public void ViewCreateTransaksi() {
        String nama = JOptionPane.showInputDialog(null, "Input Nama");
        JOptionPane.showMessageDialog(null, controllerTransaksi.getTextLayanan());
        String namaLayanan = JOptionPane.showInputDialog(null, "Input nama layanan");
        Layanan layanan = controllerTransaksi.getLayanan(namaLayanan);
        boolean lanjut = true;
        do {
            JOptionPane.showMessageDialog(null, controllerTransaksi.getTextBarang());
            String namaBarang = JOptionPane.showInputDialog(null, "Input nama barang");
            int qtyBarang = Integer.parseInt(JOptionPane.showInputDialog(null, "Input jumlah barang"));
            Barang barang = controllerTransaksi.getBarang(namaBarang);
            JOptionPane.showMessageDialog(null, controllerTransaksi.addKeranjang(barang, qtyBarang));
            int confirm = JOptionPane.showConfirmDialog(null, "Add another barang?", "Confirmation", JOptionPane.YES_NO_OPTION);
            lanjut = (confirm == JOptionPane.YES_OPTION);
        } while (lanjut);
        
        JenisPembayaran jenisBayar = (JenisPembayaran) JOptionPane.showInputDialog(
                null,
                "Select jenis pembayaran:",
                "jenisPembayaran",
                JOptionPane.QUESTION_MESSAGE,
                null,
                JenisPembayaran.values(),
                JenisPembayaran.TUNAI
        );
        
        double totalBayar = controllerTransaksi.getTotalTransaksi(controllerAnggota, nama, namaLayanan);
        
        StringBuilder message = new StringBuilder();
        message.append("List of Purchased Items:\n");
        for (Keranjang keranjang : controllerTransaksi.getKeranjang()) {
            message.append(keranjang.getBarang().getNamaBarang()).append("\n");
        }
        message.append("\n");
        message.append("Nama Pembeli: ").append(nama).append("\n");
        message.append("Tanggal Transaksi: ").append(java.time.LocalDate.now()).append("\n");
        message.append("Total Bayar: ").append(totalBayar).append("\n");
        message.append("Jenis Pembayaran: ").append(jenisBayar);

        JOptionPane.showMessageDialog(null, message.toString(), "Transaction Details", JOptionPane.INFORMATION_MESSAGE);
        
        controllerTransaksi.addTransaksi(nama, totalBayar, jenisBayar, layanan);
    }
}