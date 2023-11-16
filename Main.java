import javax.swing.*;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] arg)  throws SQLException{

    }
     String id_isbn, nm_titulo,
    int id_categoria;
    int id_editora;

    id_isbn = JOptionPane.showInputDialog ("Digite ISBN: ");
    nm_titulo = JOptionPane.showInputDialog ("Digite o titulo: ");
    id_categoria = Integer.parseInt(JOptionPane.showInputDialog ("Digite o codigo da categoria: "));
    id_editora = Integer.parseInt(JOptionPane.showInputDialog ("Digite o codigo da editora: "));
    vl_preco = Double.parseDouble(JOptionPane.showInputDialog ("Digite o preco do livro: "));
    Inserir inserir = new Inserir(id_isbn, id_categoria, id_editora, nm_titulo, vl_preco);
}
