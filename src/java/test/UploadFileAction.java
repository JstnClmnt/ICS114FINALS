/*
 * Author:Joshua Rei M. Aviles
 */
package test;

import java.io.File;
import java.io.IOException;
import helper.*;
import bean.*;
import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;

import test.FilesUtil;
import com.opensymphony.xwork2.ActionSupport;

public class UploadFileAction extends ActionSupport implements ServletContextAware{

	private static final long serialVersionUID = -4748500436762141116L;
        private String productname;
        private int productprice;
        private String category;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getProductprice() {
        return productprice;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
        
        
	@Override
	public String execute(){
            Products prod=new Products(productname,productprice,filename,category);
            new ProductCRUD().addProduct(prod);
            
		System.out.println("File Name is:"+getFileName());
		System.out.println("File ContentType is:"+getFileContentType());
		System.out.println("Files Directory is:"+filesPath);
		try {
			FilesUtil.saveFile(getFile(), getFileName(), context.getRealPath("") + File.separator + filesPath);
		} catch (IOException e) {
			e.printStackTrace();
			return INPUT;
		}
		return SUCCESS;
		
	}
	
	private File file;
	private String fileContentType;
	private String filename;
	private String filesPath;
	private ServletContext context;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFileName() {
		return filename;
	}

	public void setFileFileName(String fileFileName) {
		this.filename = fileFileName;
	}

	public void setFilesPath(String filesPath) {
		this.filesPath = filesPath;
	}

	@Override
	public void setServletContext(ServletContext ctx) {
		this.context=ctx;
	}
	
}
