
package greve;

import java.time.LocalDate;

/**
 *
 * @author fbigal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Greve novaGreve = new Greve();
        novaGreve.setDataInicio(LocalDate.of(2023, 11, 15));
        novaGreve.setMotivo("Aumento salarial");
        novaGreve.setMotivo("Melhoria das condições de trabalho");
        novaGreve.setCategoria("Professores");
        novaGreve.setCategoria("Profissionais da educação basica e superior");
    }
    
}
