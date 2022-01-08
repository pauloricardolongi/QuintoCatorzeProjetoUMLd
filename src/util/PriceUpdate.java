package util;

import java.util.function.Consumer;

import entidades.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		
		p.setPreco(p.getPreco() * 1.1);
		
	}

}
