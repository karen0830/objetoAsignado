package vista.perros;
import javax.swing.JOptionPane;

public class Perros {
	private String color;
	private int años;
	private String raza;
	private int codigo;
	private String nombre;
	public Perros(){
		
	}
	
	public Perros(String color, int años, String raza, int codigo) {
		this.codigo = codigo;
		this.color = color;
		this.años = años;
		this.raza = raza;
	}
	//encapsulación
	//color
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	//años
	public void setAños(int años) {
		this.años = años;
	}
	
	public int getAños() {
		return años;
	}
	//raza
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String getRaza() {
		return raza;
	}
	
	//codigo
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	//nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void pedirDatos(int i) {
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo de el perro " + i));
		nombre = JOptionPane.showInputDialog("Ingrese nombre de la mascota " + i);
		color = JOptionPane.showInputDialog("Ingrese color de " + getNombre());
		años = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años de la mascota " + getNombre()));
		raza = JOptionPane.showInputDialog("Ingrese raza de " + getNombre());
	}
}
