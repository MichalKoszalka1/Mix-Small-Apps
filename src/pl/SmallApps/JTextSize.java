package pl.SmallApps;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextSize extends  PlainDocument{
       //Create Limit a Words and Numbers
        private int limit ;
        public JTextSize(int limitation){
            this.limit = limitation;
        }
        public void insertString(int offSet, String str, AttributeSet set) throws BadLocationException
        {
            if (str ==null){
                return;
            }else if (getLength() + str.length() <=limit) {
                super.insertString(offSet,str,set);
            }
        }
}

