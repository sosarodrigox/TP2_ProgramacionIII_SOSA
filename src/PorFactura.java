
public class PorFactura extends Descuento{
	
	double montoFijo;
	
	public PorFactura(String nombreDescuento, double porcentaje) throws Exception {
		super(nombreDescuento, porcentaje);
		// TODO Auto-generated constructor stub
	}
	
	public PorFactura(String nombreDescuento, double porcentaje, Factura<?> factura) throws Exception {
		super(factura, nombreDescuento, porcentaje);
		// TODO Auto-generated constructor stub
	}

	public double getMontoFijo() {
		return montoFijo;
	}

	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}

	@Override
	public Double getMontoDescuento() {
		// TODO Auto-generated method stub
		if(this.porcentaje==0.0d) {
			return this.getMontoFijo();
		}else {
			
			return getPorcentaje();
		}
	}
	
	@Override
	public String toString() {
		if(this.porcentaje==0.0d) {
			return "Descuento x Factura=" + nombreDescuento + ", monto del descuento=" + getMontoDescuento() + ".";
		}else {
			
			return "Descuento x Factura=" + nombreDescuento + ", porcentaje del descuento=" + getPorcentaje()+ ".";
		}
	}
	
	
}
