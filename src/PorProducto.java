
public class PorProducto extends Descuento{

	Producto producto;
	
	public PorProducto(String nombreDescuento, double porcentaje) throws Exception {
		super(nombreDescuento, porcentaje);
		// TODO Auto-generated constructor stub
	}
	
	public PorProducto(Factura<?> factura, String nombreDescuento, double porcentaje) throws Exception {
		super(factura, nombreDescuento, porcentaje);
		// TODO Auto-generated constructor stub
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public Double getMontoDescuento() {
		// TODO Auto-generated method stub
		return this.getPorcentaje()*this.getProducto().getPrecio();
	}

	@Override
	public String toString() {
		return "Descuento x Producto=" + nombreDescuento + ", porcentaje=" + porcentaje
				+ ", monto del descuento=" + getMontoDescuento() + ".";
	}
	
	

}
