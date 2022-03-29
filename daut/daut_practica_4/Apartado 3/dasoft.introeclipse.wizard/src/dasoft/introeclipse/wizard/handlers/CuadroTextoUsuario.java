package dasoft.introeclipse.wizard.handlers;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class CuadroTextoUsuario extends TitleAreaDialog {

    private Text txtFirstName;
    private Text lastNameText;
    private Text ficherosText;

    private String firstName;
    private String lastName;
    private String ficheros;

    public CuadroTextoUsuario(Shell parentShell) {
        super(parentShell);
    }

    @Override
    public void create() {
        super.create();
        setTitle("Cuadro de dialogo con el usuario");
        setMessage("El usuario deberá introducir el nombre del proyecto y el nombre de ficheros y carpetas configurables (separdos por espacios)", IMessageProvider.INFORMATION);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite area = (Composite) super.createDialogArea(parent);
        Composite container = new Composite(area, SWT.NONE);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        GridLayout layout = new GridLayout(2, false);
        container.setLayout(layout);

        createFirstName(container);
        createLastName(container);
        createFicheros(container);

        return area;
    }

    private void createFirstName(Composite container) {
        Label lbtFirstName = new Label(container, SWT.NONE);
        lbtFirstName.setText("Nombre del proyecto");

        GridData dataFirstName = new GridData();
        dataFirstName.grabExcessHorizontalSpace = true;
        dataFirstName.horizontalAlignment = GridData.FILL;

        txtFirstName = new Text(container, SWT.BORDER);
        txtFirstName.setLayoutData(dataFirstName);
    }

    private void createLastName(Composite container) {
        Label lbtLastName = new Label(container, SWT.NONE);
        lbtLastName.setText("Nombres de carpetas configurables");

        GridData dataLastName = new GridData();
        dataLastName.grabExcessHorizontalSpace = true;
        dataLastName.horizontalAlignment = GridData.FILL;
        lastNameText = new Text(container, SWT.BORDER);
        lastNameText.setLayoutData(dataLastName);
    }
    
    private void createFicheros(Composite container) {
        Label lbtFicheros = new Label(container, SWT.NONE);
        lbtFicheros.setText("Nombres de ficheros configurables");

        GridData dataFicheros = new GridData();
        dataFicheros.grabExcessHorizontalSpace = true;
        dataFicheros.horizontalAlignment = GridData.FILL;
        ficherosText = new Text(container, SWT.BORDER);
        ficherosText.setLayoutData(dataFicheros);
    }



    @Override
    protected boolean isResizable() {
        return true;
    }

    // save content of the Text fields because they get disposed
    // as soon as the Dialog closes
    private void saveInput() {
        firstName = txtFirstName.getText();
        lastName = lastNameText.getText();
        ficheros = ficherosText.getText();

    }

    @Override
    protected void okPressed() {
        saveInput();
        super.okPressed();
    }

    public String getProyecto() {
        return firstName;
    }

    public Set<String>  getCarpetas() {
    	Set<String> partes = new HashSet<String>();
    	String[] parts = lastName.split(" ");
    	for (String part : parts) {
    		if ((part != "") && (part != " ")) {
    			partes.add(part);
    		}
    	}
    	return partes;
    }
    
    public Set<String>  getFicheros() {
    	Set<String> partes = new HashSet<String>();
    	String[] parts = ficheros.split(" ");
    	for (String part : parts) {
    		if ((part != "") && (part != " ")) {
    			partes.add(part);
    		}
    	}
    	return partes;
    }
}