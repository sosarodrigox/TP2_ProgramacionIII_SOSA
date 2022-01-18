import java.util.ArrayList;
import java.util.List;

public class Factura<T> {

	private List<T> listaDescuentos;
	private List<Producto> listaProductos;
	private Double montoTotal;
	
	public Factura(ArrayList<T> listaDescuentos) {
		super();
		this.listaDescuentos = listaDescuentos;
		this.listaProductos=new ArrayList <Producto>();
		this.montoTotal=0.0d;
	}

	public List<T> getListaDescuentos() {
		return listaDescuentos;
	}

	public void setListaDescuentos(List<T> listaDescuentos) {
		this.listaDescuentos = listaDescuentos;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public Double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}
	
	
}
