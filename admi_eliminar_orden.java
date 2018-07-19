
import resources.admi_eliminar_ordenHelper;
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
public class admi_eliminar_orden extends admi_eliminar_ordenHelper
{
	/**
	 * Script Name   : <b>permisos_de_admi_eliminar_reg</b>
	 * Generated     : <b>18/07/2018 16:18:03</b>
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
		jmb().click(atPath("Admin->Orders..."));
		
		// Frame: Administration
		password().click(atPoint(27,7));
		administration().inputChars("administrador");
		ok().click();
		
		// Frame: View Orders
		orderTable().click(atCell(atRow("ORDERID", "3", "CUSTID", "3", 
                                  "ORDERDATE", "3/10/98"), 
                            atColumn("ORDERID")), 
                     atPoint(46,0));
		deleteSelectedOrder().click();
		close().click();
	}
}

