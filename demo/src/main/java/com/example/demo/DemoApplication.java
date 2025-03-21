package com.example.demo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication
public class DemoApplication 
{

	 @PostMapping("/run-gui")
    public String runGui() 
	{
        try 
		{
            // Execute the Java GUI application
            Process process = Runtime.getRuntime().exec("java -jar path-to-your-gui-app.jar");
            return "Java GUI is opening!";
        } catch (IOException e) 
		{
            e.printStackTrace();
            return "Failed to open Java GUI.";
        }
    }

	public static void main(String[] args) 
	{
		SpringApplication.run(DemoApplication.class, args);
	}

}
