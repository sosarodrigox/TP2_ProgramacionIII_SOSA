import java.util.List;

public class Calculador {
	
	public static <T> Double calcularMontoTotal(Factura<T> factura) {
		Double total=0.0d;
		Double desc=0.0d;
		double montoTotal=0.0d;
		total=sumarizarTotalFactura(factura.getListaProductos());
		factura.setMontoTotal(total);
		desc=calcularTotalDescuentos(total,factura.getListaDescuentos());
		factura.setMontoTotal(total-desc);
		montoTotal=factura.getMontoTotal();
		System.out.println("Monto Factura sin descuentos: "+total+". Monto descuentos: "+desc+" Total a pagar: "+montoTotal);
		return montoTotal;
	}
	
	private static Double sumarizarTotalFactura(List<Producto> listaProductos) {
		Double totalFactura = 0.0d;
		for(Producto p:listaProductos) {
			totalFactura+=p.getPrecioFinal();
		}
		return totalFactura;
	}
	
	public static <T> Double calcularTotalDescuentos(Double totalF, List<T> listaDescuentos){
		Double total = 0.0d;
		for(T descuento :listaDescuentos) {
			if(descuento instanceof PorProducto) {
				PorProducto dxp = (PorProducto)descuento;
				total+=dxp.getPorcentaje()*dxp.getProducto().getPrecio();
			}else {
				PorFactura dxf=(PorFactura)descuento;
				if(dxf.getPorcentaje()==0) {
					total+=dxf.getMontoFijo();
				}else {
					total+=dxf.getPorcentaje()*(totalF-total);
				}
			}
		}
		return total;
	}
	
	/*
	private static <T> Double calcularTotalDescuentos(List<T> listaDescuentos) {
		Double total = 0.0d;
		for (T descuento : listaDescuentos) {
			total += ((Descuento) descuento).getMontoDescuento(); //CASTEO COMO DESCUENTO!
		}
		return total;
	}
	*/

}
