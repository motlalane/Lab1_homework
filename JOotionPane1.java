
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class JOotionPane1 {
    public static void main(String[] args)
    {
        double income, tax;
		//formats the numbers so that they will output with commas to look like formal monetary values
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		
		//formatter.format(amount)
		
		income = Double.parseDouble(JOptionPane.showInputDialog(null, "Please provide your taxable income:", 
				"Taxable Income dialog 1", JOptionPane.QUESTION_MESSAGE));
		

		// 18% taxable rate - finished
		if( income >= 1 && income <= 237100) {
			tax = income * .18;
			JOptionPane.showMessageDialog(null, "Your income tax is R" + formatter.format(tax));
		}
		// 26% taxable rate - finished
		else if( income >237101 && income <= 370500) {
			tax = 42678 + (.26 * (income -237101 ));
			JOptionPane.showMessageDialog(null, "Your Tax income tax is R" + formatter.format(tax));
		}
		// 31% taxable rate - finished
		else if( income >370501 && income <= 512800) {
			tax = 77362 + (.31 * (income-370501));
			JOptionPane.showMessageDialog(null, "Your federal income tax is R" + formatter.format(tax));
		}
		// 36% taxable rate
		else if( income >512801 && income <= 673000) {
			tax = 121475 + (.36 * (income-512801));
			JOptionPane.showMessageDialog(null, "Your federal income tax is R" + formatter.format(tax));
		}
		// 39% taxable rate
		else if( income >673001 && income <= 857900) {
			tax = 179147 + (.39 * (income-673001));
			JOptionPane.showMessageDialog(null, "Your federal income tax is R" + formatter.format(tax));
		}
		// 41% taxable rate
		else if( income >857901 && income <= 1817000) {
			tax = 251258 + (.35 * (income - 857901));
			JOptionPane.showMessageDialog(null, "Your federal income tax is R" + formatter.format(tax));
		}
		// 45% taxable rate
		else if (income > 1817001){
			tax = 644489 + (.45 * (income - 1817001));
			JOptionPane.showMessageDialog(null, "Your federal income tax is R" + formatter.format(tax));
		}
		// invalid input
		else {
			JOptionPane.showMessageDialog(null, "This is an invalid input, please try again later");
		}
    }
}
