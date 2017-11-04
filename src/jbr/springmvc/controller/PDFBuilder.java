package jbr.springmvc.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.GroupLayout.Alignment;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import jbr.springmvc.model.Bill;
/**
 * This view class generates a PDF document 'on the fly' based on the data
 * contained in the model.
 * @author www.codejava.net
 *
 */
public class PDFBuilder extends AbstractITextPdfView {
@Override
protected void buildPdfDocument(Map<String, Object> model, Document doc,PdfWriter writer, HttpServletRequest request, HttpServletResponse response) 
		throws Exception{
// get data model which is passed by the Spring container
List list = (List) model.get("list");

Paragraph p2=new Paragraph();
p2.setSpacingBefore(10);
p2.setSpacingAfter(10);
p2.setAlignment(Element.ALIGN_CENTER);
Chunk greenText1 = new Chunk("TAX INVOICE");
p2.add(greenText1);
doc.add(p2);
Font green = new Font(FontFamily.HELVETICA, 22, Font.ITALIC, BaseColor.GREEN);
Chunk greenText = new Chunk("Gaurav Auto Mobile", green);
 Paragraph p1=new Paragraph();
 p1.setAlignment(Element.ALIGN_CENTER);
 p1.add(greenText);
doc.add(p1);

Iterator itr = list.iterator();
Bill bill = new Bill();
while(itr.hasNext()) {
	
	 bill = (Bill) itr.next();
}
System.out.println(bill.getCustomeraddress());
String add=bill.getCustomeraddress();
	
	/*table.addCell(bill.getCustomeraddress());
	table.addCell(bill.getCustomergsttin());
	table.addCell(bill.getLabour());
	*/


}

// write table row data
}