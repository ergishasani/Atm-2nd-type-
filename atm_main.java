
import javax.swing.JOptionPane;

public class atm_main {
   public static void main(String[] args) {
      String Emri, balanca, shuma_e_shtuar, emri1 = " ";
      int password, pin = 123, leket = 500, terheqja, p, shuma_minimale, d;
      double c, opsioni, shtimi;
      boolean l, f, q;
      atm_secondary atm = new atm_secondary();
      Emri = JOptionPane.showInputDialog("Jepni Usernamen tuaj ! ");
      if (Emri == null) {
         JOptionPane.showMessageDialog(null, "Error");
      }
      if (Emri.isEmpty()) {
         JOptionPane.showMessageDialog(null, "Error");
      } else {
         password = Integer.parseInt(JOptionPane.showInputDialog("Vendosni passwordin tuaj " + Emri + "!"));
         if (password == pin) {
            String opsionet = JOptionPane
                  .showInputDialog("Shtypni nr 1 per te treguar balancen tuaj" + "\nShtypni nr 2 per te terhequr para"
                        + "\nShtypni nr 3 per te shtuar para" + "\nShtypni nr 4 per te dal nga programi");
            opsioni = Double.parseDouble(opsionet);
            if (opsioni == 1) {
               JOptionPane.showMessageDialog(null, "Balanca juaj eshte " + leket + "$");
            }
            if (opsioni == 2) {
               balanca = JOptionPane.showInputDialog(null,
                     "Balanca juaj eshte " + leket + "\nJu lutem vendosni shumen qe doni te terhiqni :");
               terheqja = (int) Double.parseDouble(balanca);
               f = terheqja > 500;

               if (f) {
                  JOptionPane.showMessageDialog(null, "Ju nuk keni kredit te mjaftueshem");
               } else {
                  c = leket - terheqja;
                  p = 0;
                  l = c == p;
                  if (l) {
                     JOptionPane.showMessageDialog(null, "Terheqja u krye me sukses!" + "\nKrediti juaj eshte 0");
                  } else {
                     JOptionPane.showMessageDialog(null,
                           "Terheqja u krye me sukses!" + "\nShuma juaj e re eshte: " + c + "$");
                  }
               }

            }
            if (opsioni == 3) {
               shuma_e_shtuar = JOptionPane.showInputDialog(null, "Jepni shumen qe doni te shtoni", "Shtim Balance",
                     JOptionPane.INFORMATION_MESSAGE);
               shtimi = Double.parseDouble(shuma_e_shtuar);
               q = shtimi >= 5000;
               if (q) {
                  JOptionPane.showMessageDialog(null, "Shuma e lejuar e depozitimit duhet te jete me pak se 5000$");
                  System.exit(0);
               }

               shuma_minimale = (int) Double.parseDouble(shuma_e_shtuar);
               d = leket + shuma_minimale;
               JOptionPane.showMessageDialog(null, "Shuma juaj e re eshte " + d + "$");
            }
            if (opsioni == 4) {
               System.exit(0);
            }
         } else if (password != pin) {
            JOptionPane.showMessageDialog(null, "Passwordi eshte i gabuar");
         }
         atm.setEmri(Emri);
         atm.setpassword(password);
      }
   }
}