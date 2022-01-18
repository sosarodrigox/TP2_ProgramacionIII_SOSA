
public abstract class Descuento {

	String nombreDescuento;
	double porcentaje;
	private Factura<?> factura;
	
	public Descuento(String nombreDescuento, double porcentaje) throws Exception{
		super();
		this.nombreDescuento = nombreDescuento;
		if(porcentaje<0 || porcentaje>1) throw new Exception("ERROR. El descuento debe estar entre 0 y 1");
		this.porcentaje = porcentaje;
	}
	
	public Descuento(Factura<?> factura, String nombreDescuento, double porcentaje) throws Exception{
		super();
		this.factura=factura;
		this.nombreDescuento = nombreDescuento;
		if(porcentaje<0 || porcentaje>1) throw new Exception("ERROR. El descuento debe estar entre 0 y 1");
		this.porcentaje = porcentaje;
	}

	public String getNombreDescuento() {
		return nombreDescuento;
	}

	public void setNombreDescuento(String nombreDescuento) {
		this.nombreDescuento = nombreDescuento;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public Factura<?> getFactura() {
		return factura;
	}

	public void setFactura(Factura<?> factura) {
		this.factura = factura;
	}

	public abstract Double getMontoDescuento();
}
