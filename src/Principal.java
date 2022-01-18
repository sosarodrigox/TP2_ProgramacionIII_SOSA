import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//CASO N°1
			System.out.println("CASO N°1: ");
			System.out.println("\n A) Carga de Productos.");
			Factura <Descuento> facturaC1 = new Factura<Descuento>(new ArrayList<Descuento>());
			Producto producto1 = new Producto(0.21d,"Bicicleta",78000d);
			System.out.println(producto1.toString());
			Producto producto2 = new Producto(0.105d,"Vaporera",9400);
			System.out.println(producto2.toString());
			
			System.out.println("\n B) Carga de Descuentos.");
			PorProducto desBici = new PorProducto("Descuento Bicicleta",0.05);
			desBici.setProducto(producto1);
			System.out.println(desBici.toString());
			PorFactura desFactura = new PorFactura ("Descuento Amigo",0.0d,facturaC1);
			desFactura.setMontoFijo(1100.0d);
			System.out.println(desFactura.toString());
			
			facturaC1.getListaProductos().add(producto1);
			facturaC1.getListaProductos().add(producto2);
			facturaC1.getListaDescuentos().add(desBici);
			facturaC1.getListaDescuentos().add(desFactura);
			
			System.out.println("\nC) Calculos finales.");
			Calculador.calcularMontoTotal(facturaC1);
			
			//CASO N°2
			System.out.println("\n\nCASO N°2: ");
			System.out.println("\n A) Carga de Productos.");
			Factura <Descuento> facturaC2 = new Factura<Descuento>(new ArrayList<Descuento>());
			Producto producto3 = new Producto(0.21d,"Lavarropa",132500d);
			System.out.println(producto3.toString());
			Producto producto4 = new Producto(0.21d,"Tostadora",2700d);
			System.out.println(producto4.toString());
			Producto producto5 = new Producto(0.21d,"Heladera",210000d);
			System.out.println(producto5.toString());
			Producto producto6 = new Producto(0.105d,"Ventilador",23000d);
			System.out.println(producto6.toString());
			
			facturaC2.getListaProductos().add(producto3);
			facturaC2.getListaProductos().add(producto4);
			facturaC2.getListaProductos().add(producto5);
			facturaC2.getListaProductos().add(producto6);
			
			System.out.println("\n B) Carga de Descuentos.");
			PorProducto desLav = new PorProducto("Descuento Lavarropa",0.15);
			desLav.setProducto(producto3);
			System.out.println(desLav.toString());
			PorProducto desTost = new PorProducto("Descuento Tostadora",0.35);
			desTost.setProducto(producto4);
			System.out.println(desTost.toString());
			PorProducto desHel = new PorProducto("Descuento Heladera",0.25);
			desHel.setProducto(producto5);
			System.out.println(desHel.toString());
			PorProducto desVent = new PorProducto("Descuento Ventilador",0.1);
			desVent.setProducto(producto6);
			System.out.println(desVent.toString());
			PorFactura desFactura2 = new PorFactura ("Descuento Empleado Público",0.05d,facturaC2);
			System.out.println();
			desFactura2.getMontoDescuento();
			//desFactura2.setMontoFijo(1100.0d);
			System.out.println(desFactura2.toString());
			
			
			facturaC2.getListaDescuentos().add(desLav);
			facturaC2.getListaDescuentos().add(desTost);
			facturaC2.getListaDescuentos().add(desHel);
			facturaC2.getListaDescuentos().add(desVent);
			facturaC2.getListaDescuentos().add(desFactura2);
			
			System.out.println("\nC) Calculos finales.");
			Calculador.calcularMontoTotal(facturaC2);
			
			//CASO N°3
			System.out.println("\n\nCASO N°3: ");
			System.out.println("\n A) Carga de Productos.");
			Factura <Descuento> facturaC3 = new Factura<Descuento>(new ArrayList<Descuento>());
			Producto producto7 = new Producto(0.21d,"Notebook",158000d);
			System.out.println(producto7.toString());
			Producto producto8 = new Producto(0.21d,"Sony Music Center",135000d);
			System.out.println(producto8.toString());
			
			System.out.println("\n B) Carga de Descuentos.");
			PorProducto desSony = new PorProducto("Descuento Sony",0.18d);
			desSony.setProducto(producto8);
			System.out.println(desSony.toString());
			PorFactura desFactura3 = new PorFactura ("Descuento Tecno",0.075d,facturaC3);
			System.out.println(desFactura3.toString());
			
			facturaC3.getListaProductos().add(producto7);
			facturaC3.getListaProductos().add(producto8);
			facturaC3.getListaDescuentos().add(desSony);
			facturaC3.getListaDescuentos().add(desFactura3);
			
			System.out.println("\nC) Calculos finales.");
			Calculador.calcularMontoTotal(facturaC3);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
