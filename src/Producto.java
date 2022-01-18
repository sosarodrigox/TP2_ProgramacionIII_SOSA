
public class Producto {
	
	private double impuesto;
	private String nombre;
	private double precio;
	
	public Producto(double impuesto, String nombre, double precio) throws Exception{
		super();
		if(impuesto>1 || impuesto <0) throw new Exception ("ERROR. El valor del impuesto tiene que estar entre 0 y 1");
		this.impuesto = impuesto;
		this.nombre = nombre;
		if(precio<=0) throw new Exception ("ERROR. El precio no puede ser menor o igual a 0.");
		this.precio = precio;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Double getPrecioFinal() {
		Double precioFinal = this.precio+(this.precio*this.impuesto);
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Producto:" + nombre + ", precio de lista=" + precio + ", impuesto=" + impuesto + ", precio S/Descuentos="
				+ getPrecioFinal() + ".";
	}
}
