import java.io.File;

public class CreateDirectoryExample {

	
		// TODO Auto-generated method stub
		
	    private static final String FOLDER ="C:\\Users\\rjaiswar\\Desktop\\Rama";
	    
	    public static void main(String[] args) {
	         
	        File newFolder = new File(FOLDER);
	         
	        boolean created =  newFolder.mkdir();
	         
	        if(created)
	            System.out.println("Folder was created !");
	        else
	            System.out.println("Unable to create folder");


	}

}
