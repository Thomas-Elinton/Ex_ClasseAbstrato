
package ex_classeabstrato;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
       
        ArrayList<Funcionario> listFuncionario = new ArrayList<>();
        
        int cracha, opc=0, tipo , horas;
        String nome, setor ,funcao;
        double valor, desconto;
        
        while (opc != 3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1- Criar Funcionario \n 2- Mostrar \n 3- Sair"));
            
            switch (opc){
                case 1: 
                    cracha = Integer.parseInt(JOptionPane.showInputDialog("Crachá"));
                    nome = JOptionPane.showInputDialog("Nome");
                    setor = JOptionPane.showInputDialog("Setor");
                    funcao = JOptionPane.showInputDialog("Função");
                    tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo: \n 1-Horista \n 2-Mensalista"));
                    
                    if(tipo == 1){
                        horas = Integer.parseInt(JOptionPane.showInputDialog("Qtd de Horas"));
                        valor = Double.parseDouble (JOptionPane.showInputDialog("Valor"));
                        listFuncionario.add(new FuncionarioHorista(horas, valor, cracha, nome, setor, funcao));
                            }else{
                        
                        desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto"));
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
                        listFuncionario.add(new FuncionarioMensalista(valor, desconto, cracha, nome, setor, funcao));

                        }
                    
                    
                    break;
                case 2: 
                    String msg = "";
                    for(Funcionario f : listFuncionario){
                        msg += f.imprimir()+ "\n\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);

                    break;
                case 3: break;
                
            }
        }
        
        
    }
    
}
