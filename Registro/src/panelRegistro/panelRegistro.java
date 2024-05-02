package panelRegistro;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.beans.PropertyChangeEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class panelRegistro extends javax.swing.JPanel {

    File rutaImagen;
    String Contraseña;
    
    public panelRegistro() {
        initComponents();
        errorUsuario.setVisible(false);
        errorContraseña.setVisible(false);
        ojoAbierto.setVisible(false);
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    
    
    ArrayList<Usuario> Usuarios = new ArrayList<>();
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iconoUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        iconoCandado = new javax.swing.JLabel();
        ojoAbierto = new javax.swing.JLabel();
        ojoCerrado = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        errorContraseña = new javax.swing.JLabel();
        errorUsuario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(700, 400));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        iconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelRegistro/iconoUsuario.png"))); // NOI18N

        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        iconoCandado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelRegistro/iconoCandado.png"))); // NOI18N

        ojoAbierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelRegistro/ojoAbierto.png"))); // NOI18N
        ojoAbierto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ojoAbiertoMouseClicked(evt);
            }
        });

        ojoCerrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panelRegistro/ojoCerrado.png"))); // NOI18N
        ojoCerrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ojoCerradoMouseClicked(evt);
            }
        });

        btnRegistrar.setText("Registrarme");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        errorContraseña.setForeground(new java.awt.Color(153, 0, 0));
        errorContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        errorContraseña.setText("<html>\nAsegurate de incluir: <br>\n8 caracteres <br>\n1 mayuscula <br>\n1 minuscula <br>\n1 número <br>");
        errorContraseña.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        errorUsuario.setForeground(new java.awt.Color(153, 0, 0));
        errorUsuario.setText("Nombre de usuario no valido o no disponibe");

        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconoUsuario)
                        .addGap(10, 10, 10)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(errorUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconoCandado)
                        .addGap(10, 10, 10)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ojoCerrado)
                            .addComponent(ojoAbierto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(errorContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnRegistrar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(errorUsuario)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoCandado)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ojoCerrado))
                    .addComponent(ojoAbierto))
                .addGap(4, 4, 4)
                .addComponent(errorContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnRegistrar))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        errorUsuario.setVisible(false);
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        errorContraseña.setVisible(false);
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void ojoCerradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoCerradoMouseClicked
        ojoCerrado.setVisible(false);
        ojoAbierto.setVisible(true);
        txtContraseña.setEchoChar((char)0);
    }//GEN-LAST:event_ojoCerradoMouseClicked

    private void ojoAbiertoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoAbiertoMouseClicked
        ojoCerrado.setVisible(true);
        ojoAbierto.setVisible(false);
        txtContraseña.setEchoChar('*');
    }//GEN-LAST:event_ojoAbiertoMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         if (validarUsuario()) {
       if (validarContraseña()) {
         this.Usuarios.add(new Usuario(this.txtUsuario.getText(), this.txtContraseña.getText()));
         escribirArray();
         JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
       } else {
         this.errorContraseña.setVisible(true);
       } 
     } else {
       this.errorUsuario.setVisible(true);
     } 

    }//GEN-LAST:event_btnRegistrarActionPerformed

   
    private void lblLogoPropertyChange(PropertyChangeEvent evt) {}
    
    private void changeBackgroundColor() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(this.rutaImagen);
        } catch (IOException e) {
            e.printStackTrace();
            return; // Salir si no se puede cargar la imagen
        }

        Color dominantColor = getDominantColor(img);
        this.jPanel1.setBackground(dominantColor);
    }
    
    private Color getDominantColor(BufferedImage img) {
        int width = img.getWidth();
        int height = img.getHeight();
        
        // Variables para almacenar los componentes de color
        int totalRed = 0;
        int totalGreen = 0;
        int totalBlue = 0;
        int numPixels = width * height;
        
        // Iterar sobre todos los píxeles de la imagen
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Obtener el color del píxel en la posición (x, y)
                Color pixelColor = new Color(img.getRGB(x, y));
                
                // Sumar los componentes de color
                totalRed += pixelColor.getRed();
                totalGreen += pixelColor.getGreen();
                totalBlue += pixelColor.getBlue();
            }
        }
        
        // Calcular el promedio de los componentes de color
        int avgRed = totalRed / numPixels;
        int avgGreen = totalGreen / numPixels;
        int avgBlue = totalBlue / numPixels;
        
        // Crear y devolver el color dominante
        return new Color(avgRed, avgGreen, avgBlue);
    }
    
    @Override
     protected void paintComponent(Graphics g) {
     super.paintComponent(g);
     if (this.rutaImagen != null) {
       ImageIcon icon = new ImageIcon(this.rutaImagen.getAbsolutePath());
       this.lblLogo.setIcon(icon);
      changeBackgroundColor();
     } 
   }

     public boolean validarUsuario() {
     for(Usuario u: Usuarios){
       if (u.getNombre().equals(this.txtUsuario.getText()) || this.txtUsuario.getText().isBlank()) {
         return false;
       }
      }
     return true;
   }
   
   public boolean validarContraseña() {
     this.Contraseña = this.txtContraseña.getText();
 
     
     String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
     return this.Contraseña.matches(regex);
   }
   
   public void escribirArray() {
     try {
       String nombreArchivo = "Registros.txt";
       
       File archivo = new File(nombreArchivo);
       
       if (!archivo.exists()) {
         archivo.createNewFile();
         System.out.println("Archivo creado exitosamente.");
       } 
       
       FileWriter fw = new FileWriter(archivo, true);
       
       BufferedWriter bw = new BufferedWriter(fw);
       bw.write(this.txtUsuario.getText() + "," + this.txtContraseña.getText());
       bw.newLine();
 
       
       bw.close();
       JOptionPane.showMessageDialog(null, "Archivo creado exitosamente");
     } catch (IOException e) {
       e.printStackTrace();
     } 
   }

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel errorContraseña;
    private javax.swing.JLabel errorUsuario;
    private javax.swing.JLabel iconoCandado;
    private javax.swing.JLabel iconoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel ojoAbierto;
    private javax.swing.JLabel ojoCerrado;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
