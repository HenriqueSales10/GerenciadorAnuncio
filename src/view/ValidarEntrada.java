/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * <h1>Classe que permite ao usuário informar apenas números e "." para
 * cadastrar investimento por dia</h1>
 *
 * @author henri
 */
public class ValidarEntrada extends PlainDocument {

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str.replaceAll("[^0-9|^.]", ""), a);

    }
}
