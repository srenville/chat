/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat2;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


class FileListener extends Thread{
    
    public void run(){
                            try{
                                while(true){
                                    byte recFileBuffer[]=new byte[3072];
                                    DatagramSocket recSocket=new DatagramSocket(2000);
                                   // FileOutputStream infile=new FileOutputStream("C:/Users/Toozigba/Documents/Master Comp Sci/dis comp/assign 1/rec/sent.txt");
                                    DatagramPacket dp=new DatagramPacket(recFileBuffer,recFileBuffer.length);
                                    recSocket.receive(dp);
                                    System.out.println(new String(dp.getData(),0,dp.getLength()));  
                                    
                                    server_111.writeToFile(new String(dp.getData()).trim());
                                }
                                    
                            }catch(Exception e){
                                
                            }
                               
                            
        
        
    }
    
}

/**
 *
 * @author Toozigba
 */
public class server_111 extends javax.swing.JFrame {

    /**
     * Creates new form server
     */
    static String ipAddress="";
    
    static int port=1202;
    static DatagramSocket  aSocket=null;
    static DatagramSocket  bSocket=null;
    static FileListener fl = new FileListener();
    
    public server_111() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        userName = new javax.swing.JTextField();
        ipAd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        about = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        not_area = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        message_area = new javax.swing.JTextArea();
        text_area = new javax.swing.JTextField();
        send_button = new javax.swing.JButton();
        attach_file = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(133, 148, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat2/images/icons8-collaboration-80.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, 110));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("We Love, We Live, We Chat.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 60));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 50));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IP Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 140, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 140, 10));

        userName.setBackground(new java.awt.Color(133, 148, 228));
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("Enter your screen name");
        userName.setToolTipText("");
        userName.setBorder(null);
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 140, -1));

        ipAd.setBackground(new java.awt.Color(133, 148, 228));
        ipAd.setForeground(new java.awt.Color(255, 255, 255));
        ipAd.setText("Enter IP Address");
        ipAd.setBorder(null);
        ipAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipAdActionPerformed(evt);
            }
        });
        jPanel1.add(ipAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 140, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, 50));

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat2/images/icons8-info-16.png"))); // NOI18N
        about.setBorderPainted(false);
        about.setContentAreaFilled(false);
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jPanel1.add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jScrollPane1.setWheelScrollingEnabled(false);

        not_area.setEditable(false);
        not_area.setBackground(new java.awt.Color(133, 148, 228));
        not_area.setColumns(20);
        not_area.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        not_area.setForeground(new java.awt.Color(255, 255, 255));
        not_area.setRows(5);
        not_area.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        not_area.setHighlighter(null);
        jScrollPane1.setViewportView(not_area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 310, 110));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(133, 148, 228));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat2/images/icons8-quick-mode-on-40.png"))); // NOI18N
        jButton1.setText("Ping (C)");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 190, 50));

        message_area.setColumns(20);
        message_area.setRows(5);
        jScrollPane2.setViewportView(message_area);

        text_area.setText("Enter text here");
        text_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_areaActionPerformed(evt);
            }
        });

        send_button.setText("Send");
        send_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_buttonActionPerformed(evt);
            }
        });

        attach_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat2/images/icons8-attach-40.png"))); // NOI18N
        attach_file.setBorderPainted(false);
        attach_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attach_fileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_area, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(send_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attach_file, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(send_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_area, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attach_file, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed

    private void ipAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipAdActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_ipAdActionPerformed

    private void text_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_areaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_text_areaActionPerformed

    private void send_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_buttonActionPerformed
        // TODO add your handling code here:
      try{      //send a udp packet
                not_area.setText("online....");
                InetAddress ip = InetAddress.getByName(ipAd.getText().trim()); //change ipAddress to Inet
                bSocket = new DatagramSocket();
                String msgout="";
                msgout=text_area.getText().trim();//gets message from text area
                DatagramPacket reply = new DatagramPacket(msgout.getBytes(), msgout.length(), 
                                        ip, 1202);//creates reply to send to port 1201 which client is listening on
                message_area.setText(message_area.getText().trim()+"\n\n"+new java.util.Date() +"\n"+userName.getText().trim()+":"+msgout); 
                                        bSocket.send(reply);//send packet
        
        }
      catch(Exception e){
          
                         }
   
    }//GEN-LAST:event_send_buttonActionPerformed

    private void attach_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attach_fileActionPerformed
        try {
            // TODO add your handling code here:
            
            not_area.setText("sendng file....");
            JFileChooser fChooser = new JFileChooser();
            fChooser.setCurrentDirectory(new java.io.File("C:/"));
            fChooser.setDialogTitle("Choose File");
            fChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            if(fChooser.showOpenDialog(attach_file)==JFileChooser.APPROVE_OPTION)
            {
                
            }
            
            this.sendFile(fChooser.getSelectedFile().getAbsolutePath());
        } catch (SocketException ex) {
            Logger.getLogger(server_111.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(server_111.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_attach_fileActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            InetAddress ip = InetAddress.getByName(ipAd.getText().trim());
            bSocket = new DatagramSocket();
            String msgout="alert!!!!";

            DatagramPacket reply = new DatagramPacket(msgout.getBytes(), msgout.length(),
                ip, 1202);
            message_area.setText(message_area.getText().trim()+"\n\n " +userName.getText().trim()+": "+msgout);
            bSocket.send(reply);

        }
        catch(Exception e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        not_area.setText("Sofware name: We Chat\n" +
"Author:Seon Renville\n" +
"Date Created:\n" +
"Version Number: 1\n" +
"Description:\n" +
"Student Number: 816010459");
    }//GEN-LAST:event_aboutActionPerformed
public void sendFile(String filePath) throws FileNotFoundException, SocketException, IOException{
                        byte fileBuffer[]=new byte[1024];
                        FileInputStream outfile=new FileInputStream(filePath);
                        DatagramSocket fsocket=new DatagramSocket();
                        int i=0;
                        while(outfile.available()!=0)
                        {
                                    fileBuffer[i]=(byte)outfile.read();
                                    i++;
                        }                     
                        outfile.close();
                        fsocket.send(new DatagramPacket(fileBuffer,i,InetAddress.getLocalHost(),1000));
    }

public static void writeToFile(String stream) throws FileNotFoundException, UnsupportedEncodingException, IOException{
                    try
                            (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/WeChat/rec.txt"),
                                    "utf-8"))){
                                                    writer.write(stream);
  
                                               }
                    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(server_111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(server_111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(server_111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(server_111.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new server_111().setVisible(true);
            }
        });
 
       
		try{
	    	aSocket = new DatagramSocket(1201);//listens for incomming udp packets on port 1201
					// create socket at agreed port
			fl.start();
 			while(true){
                            
                                  
                                        
                                        byte[] buffer = new byte[1000];//temp storage, awaiting marshalling
                                        DatagramPacket request = new DatagramPacket(buffer, buffer.length);//datagram packet set to length of buffer
                                        aSocket.receive(request);  //accepts packet
                                        message_area.setText(message_area.getText().trim()+"\n\n"+ new java.util.Date()+ "\n "+"Client: "+new String(request.getData())); //display message and details to ui

                                        java.awt.Toolkit.getDefaultToolkit().beep();//alert user of new message

                              
                                    }
		}catch (SocketException e){System.out.println("Socket: " + e.getMessage());
		}catch (IOException e) {System.out.println("IO: " + e.getMessage());
		}finally {if(aSocket != null) aSocket.close();}
    
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private static javax.swing.JButton attach_file;
    private static javax.swing.JTextField ipAd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private static javax.swing.JTextArea message_area;
    private javax.swing.JTextArea not_area;
    private javax.swing.JButton send_button;
    private static javax.swing.JTextField text_area;
    private static javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
