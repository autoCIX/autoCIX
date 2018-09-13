package com.selenium.iirribarria.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistroSQA {
	public static void main(String[] args) throws InterruptedException {

		// Paso 1 - Configurar el driver con GoogleChrome
		String exePath = "C:\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/?gl=ES&hl=es");
		Thread.sleep(3000);

		driver.close();
		System.out.println("Test case finalizado");

	}
}