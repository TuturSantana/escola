import javax.swing.JOptionPane;

public class joption2 {
    public static void main(String[] args) {
        
        String numsString= JOptionPane.showInputDialog("Digite um número");
        int num = Integer.parseInt(numsString);

        for (int i = 1; i<11; i ++){
            int resultado = num * i;

            JOptionPane.showMessageDialog(null, num + "x" + (i) + "=" + resultado, "Tabuada do "+ i, JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
