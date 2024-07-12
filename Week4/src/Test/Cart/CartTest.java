package Test.Cart;
import AIMS.Cart.Cart;
import AIMS.media.DigitalVideoDisc;
import Test.media.MediaObjects;

public class CartTest extends MediaObjects {
    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addMedia(dvd1);
        cart.addMedia(new DigitalVideoDisc[] { dvd1, dvd2, dvd3, dvd1, dvd3, dvd2, dvd1 });
        cart.addMedia(dvd3, dvd3);

        cart.displayCart();
        cart.searchCart("the lioN King");
        cart.searchCart("titanic");
        cart.searchCart(2);
        cart.searchCart(3);
    }
}

