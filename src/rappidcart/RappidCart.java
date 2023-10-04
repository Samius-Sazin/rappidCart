package rappidcart;

public class RappidCart {
    
    public static void calling(){
        loading_page l_p = new loading_page();
        l_p.connect_loading_page();
        
        new login().setVisible(true);
    }
    
    public static void main(String[] args) {
        RappidCart rc = new RappidCart();
        rc.calling();
    }
}