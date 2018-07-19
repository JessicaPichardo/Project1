
import resources.eliminar_clienteHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author DELL
 */
public class eliminar_cliente extends eliminar_clienteHelper
{
	/**
	 * Script Name   : <b>eliminar_cliente</b>
	 * Generated     : <b>18/07/2018 17:08:27</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2018/07/18
	 * @author DELL
	 */
	public void testMain(Object[] args) 
	{
		
		// Frame: ClassicsCD
		jmb().click(atPath("Admin"));
		jmb().click(atPath("Admin->Customers..."));
		
		// Frame: Administration
		administration().inputChars("administrador");
		ok().click();
		
		// Frame: View Customers
		custTable().click(atCell(atRow("CUSTID", "4", "NAME", 
                                 "Trent Culpito", "STREET", 
                                 "75 Wall St 22nd Fl"), 
                           atColumn("CUSTID")), 
                    atPoint(25,7));
		deleteSelectedCustomer().click();
		custTable().click(atCell(atRow("CUSTID", "6", "NAME", 
                                 "Emma Trenchenza", "STREET", 
                                 "3611 14th Ave"), 
                           atColumn("NAME")), 
                    atPoint(22,7));
		deleteSelectedCustomer().click();
		close().click();
	}
}

