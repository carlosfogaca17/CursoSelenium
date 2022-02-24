import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {
	
	@Test
	public void teste() {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\�rea de Trabalho\\Backup Foga�a\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\�rea de Trabalho\\Backup Foga�a\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\�rea de Trabalho\\Backup Foga�a\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\msedgedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		
		//***M�todos que definem a posi��o do browser
		//driver.manage().window().setPosition(new Point(100, 100));
		
		//***M�todos que definem o tamanho do browser
		//driver.manage().window().setSize(new Dimension(1200, 765));
		
		//***M�todos que definem a maximiza��o do browser
		driver.manage().window().maximize();
		
		//***M�todo que define qual url navegar
		driver.get("http://www.google.com.br");
		Assert.assertEquals("Google", driver.getTitle());
		
		//***M�todo que finaliza a tarefa de processos dos drivers no gerenciador de tarefas. Ex.: geckodriver, chormedriver.
		driver.quit();
	}

}
