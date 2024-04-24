import javax.swing.JOptionPane;

public class joption {
    public static void main(String[] args) {
        String numstring = JOptionPane.showInputDialog("Digite um número: ");
        int num = Integer.parseInt(numstring);

        if (num % 2==0){
            JOptionPane.showMessageDialog(null, num + " é par ", "É par ou ímpar?", JOptionPane.INFORMATION_MESSAGE);
        }

        else JOptionPane.showMessageDialog(null, num + " não é par", "É par ou ímpar?", JOptionPane.INFORMATION_MESSAGE);

    }
}
