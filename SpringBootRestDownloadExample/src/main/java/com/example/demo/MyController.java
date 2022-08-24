package com.example.demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class MyController {
	
	@RequestMapping(value = "/upload",method=RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	    
	    public String fileUpload(@RequestParam("fileinfo") MultipartFile file) {
	          String result = "File was uploaded successfully";
	          try {
	        	  File f=new File("F:\\m"+file.getOriginalFilename());
	        	  f.createNewFile();
	        	  FileOutputStream g=new FileOutputStream(f);
	        	  g.write(file.getBytes());
	        	  g.close();
	          }
	          catch(IOException ex){
	        	  result="error"+ex.getMessage();
	          }
	
	          return result;
	}
	//Download file

	// download file
	    
	   /* @GetMapping(value = "/download")   
	    public ResponseEntity<Object> downloadFile() throws IOException  {
	        // server location of file which user wants to download   
	    	String fileName = "F:\\m\\p.jpg";
	    	
	    	//Create classloader object-- to load file in memory
	    	ClassLoader classLoader = new MyController().getClass().getClassLoader();
	    	// Get file from physical ststem to memory by using Classloader
	    	File file = new File(classLoader.getResource(fileName).getFile()); 
	    	//Read your file
	    	   	
	    	InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
	     
	    	//Prepare Header to send it to client side
	    	HttpHeaders headers = new HttpHeaders();
	    	//providing information about data type
	        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", file.getName()));
	        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
	        headers.add("Pragma", "no-cache");
	        headers.add("Expires", "0");
	        
	     
	        //prepare responseentity (header-- file information, body-- contains data of file)
	        ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers).contentLength(file.length())
	        		.contentType(MediaType.parseMediaType("application/jpg")).body(resource);
	        
	     return responseEntity;
	    }
		*/
	@GetMapping("/download")
    public ResponseEntity downloadFileFromLocal() {
        //Get file path
        Path path = Paths.get("F:\\m\\p.jpg");
        Resource resource = null;
        try {
            //put file in resource object
            resource = new UrlResource(path.toUri());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //prepare packet-- header and body
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/text"))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
		
	
	
}

    
    



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	    
        


       