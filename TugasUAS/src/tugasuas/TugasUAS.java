
package tugasuas;

import java.sql.SQLException;

/**
 *
 * @author sriap
 */
public class TugasUAS {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) throws SQLException  {
//        new Jform1().setVisible(true);
        
        jForm1 jf = new jForm1();
        jf.setResizable(false);
        jf.setAlwaysOnTop(true);
        jf.setVisible(true);
    }
    
}
    
