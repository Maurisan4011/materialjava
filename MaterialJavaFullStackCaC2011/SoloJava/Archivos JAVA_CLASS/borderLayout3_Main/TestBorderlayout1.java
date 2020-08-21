
package borderLayout3_Main;

import javax.swing.JFrame;


public class TestBorderlayout1 {
    
    JFrame marco ;

    public TestBorderlayout1() {
        
        marco = new JFrame("Test");

    }
    
    public void marco(){
    
       marco.setBounds(300, 200, 200, 300); 
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setVisible(true);
       
       
    }
    
    

    public static void main(String[] args) {
        // TODO code application logic here
        TestBorderlayout1 t = new TestBorderlayout1();
        t.marco();
    }
    
}
