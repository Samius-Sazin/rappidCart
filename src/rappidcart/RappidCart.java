/*
    ********** rappidCart **********
            Name : Samius Sazin
            ID: 0242220005101236
            Batch_63
            Department of C.S.E
            Daffodil International University
            
            Start on    : September 27, 2023
            Complete on : November  12, 2023
*/

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