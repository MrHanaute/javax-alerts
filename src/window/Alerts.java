package window;

import javax.swing.JOptionPane;

public class Alerts {
	public static void alert(String m) {
		JOptionPane.showMessageDialog(null, m);
	}
	public static void error(String m, String t) {
		JOptionPane.showMessageDialog(null, m, t, JOptionPane.ERROR_MESSAGE);
	}
	public static void success(String m, String t) {
		JOptionPane.showMessageDialog(null, m, t, JOptionPane.QUESTION_MESSAGE);
	}

	public static String getString(String m, boolean necessario) {
		String r;
		
		while(true) {
			r = JOptionPane.showInputDialog(m);
			if( necessario && ( r == null || r.trim().length() == 0 ) ) {
				alert("Paramentro obrigatorio!");
			}else {
				return r;
			}
		}
	}
	
	public static int getInt(String m, boolean necessario, int p) {
		String r;
		
		while(true) {
			r = JOptionPane.showInputDialog(m);
			if( ( r == null || r.trim().length() == 0 ) ) {
				if(necessario) {
					error("Valor obrigatorio!", "Erro");
					continue;
				}else {
					return p;
				}
			}
			try {
			   int v = Integer.parseInt(r, 10);
			   return v;
			}catch(Exception ex){
				error("Digite um numero!", "Erro");
			}
		}
	}
	public static double getDouble(String m, boolean necessario, double p) {
		String r;
		
		while(true) {
			r = JOptionPane.showInputDialog(m);
			if( ( r == null || r.trim().length() == 0 ) ) {
				if(necessario) {
					error("Valor obrigatorio!", "Erro");
					continue;
				}else {
					return p;
				}
			}
			try {
				double v = Double.parseDouble(r);
				return v;
			}catch(Exception ex){
				error("Digite um numero!", "Erro");
			}
		}
	}
	public static float getFloat(String m, boolean necessario, float d) {
		String r;
		
		while(true) {
			r = JOptionPane.showInputDialog(m);
			if( ( r == null || r.trim().length() == 0 ) ) {
				if(necessario) {
					error("Valor obrigatorio!", "Erro");
					continue;
				}else {
					return d;
				}
			}
			try {
				float v = Float.parseFloat(r);
				return v;
			}catch(Exception ex){
				error("Digite um numero!", "Erro");
			}
		}
	}
}
