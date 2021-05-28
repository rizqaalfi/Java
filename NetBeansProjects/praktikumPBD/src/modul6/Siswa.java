/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;
    import javax.swing.*;
    import java.awt.event.*;
/**
 * Rizqa Alfiani
 * E31191919
 */
public class Siswa extends JFrame implements ActionListener {
private JPanel jpSiswa = new JPanel();
private JLabel lblNis= new JLabel("Nis:"),lblNama = new JLabel("Nama:"),
        lblPassword = new JLabel("Password:"), lblAlamat= new JLabel("Alamat")
        ,lblEmail = new JLabel("Email:"),lblJenisKelamin =new JLabel("JenisKelamin");
private JTextField txtNis = new JTextField(),txtNama = new JTextField(), 
        txtPassword= new JTextField(),txtAlamat = new JTextField(), txtEmail 
        = new JTextField();
private JComboBox cboJenisKelamin = new JComboBox();
private JButton btnTambah = new JButton("Tambah"),btnUbah = new JButton("Ubah"),
        btnHapus= new JButton("Hapus"),btnBersih = new JButton("Bersih");

Siswa(){
    super("Entri Data MHS");
    setSize(500,300);
    jpSiswa.setLayout(null);
    
    // mengatur letak objek pada container
    lblNis.setBounds(15, 20, 100, 25);
    lblNama.setBounds(15,55,100,25);
    lblPassword.setBounds(15,90,100,25);
    lblAlamat.setBounds(15,125,100,25);
    lblEmail.setBounds(15,160,100,25);
    lblJenisKelamin.setBounds(15,195,100,25);
    
    txtNis.setBounds(115,20,100,25);
    txtNama.setBounds(115,55,100,25);
    txtPassword.setBounds(115,90,100,25);
    txtAlamat.setBounds(115,125,150,25);
    txtEmail.setBounds(115,160,100,25);
    cboJenisKelamin.setBounds(115,195,50,25);
    
    btnTambah.setBounds(340,20,85,25);
    btnUbah.setBounds(340,55,85,25);
    btnHapus.setBounds(340,90,85,25);
    btnBersih.setBounds(340,125,85,25);
    
    //mengatur / meletakkan objek pada objek panel
    jpSiswa.add(lblNis);
    jpSiswa.add(lblNama);
    jpSiswa.add(lblPassword);
    jpSiswa.add(lblAlamat);
    jpSiswa.add(lblEmail);
    jpSiswa.add(lblJenisKelamin);
    
    jpSiswa.add(txtNis);
    jpSiswa.add(txtNama);
    jpSiswa.add(txtPassword);
    jpSiswa.add(txtAlamat);
    jpSiswa.add(txtEmail);
    jpSiswa.add(cboJenisKelamin);
    
    jpSiswa.add(btnTambah);
    jpSiswa.add(btnUbah);
    jpSiswa.add(btnHapus);
    jpSiswa.add(btnBersih);
    
    //mengisi combo Jenis Kelamin
    cboJenisKelamin.addItem("L");
    cboJenisKelamin.addItem("P");
    
    //mengatur objek agar dapat berntraksi dangan user
    btnTambah.addActionListener(this);
    btnUbah.addActionListener(this);
    btnHapus.addActionListener(this);
    btnBersih.addActionListener(this);
    
    //menambahkan objek JPanel pada objek container frame
    getContentPane().add(jpSiswa);
    
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed( ActionEvent ae){
    Object obj =ae.getSource();
    if(obj==btnTambah){
        Tambah();
    }
    if (obj==btnUbah){
        Ubah();
    }
    if (obj==btnHapus){
        Hapus();
    }
    Bersih();
    
}

    void Tambah() {
        
    }

    void Ubah() {
    }

   void Hapus() {
    }
   void Bersih(){
   }
   
   public static void main (String[] args){
       new Siswa();
   }
}

