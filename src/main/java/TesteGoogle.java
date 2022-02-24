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
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\Área de Trabalho\\Backup Fogaça\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\Área de Trabalho\\Backup Fogaça\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\Área de Trabalho\\Backup Fogaça\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\msedgedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		
		//***Métodos que definem a posição do browser
		//driver.manage().window().setPosition(new Point(100, 100));
		
		//***Métodos que definem o tamanho do browser
		//driver.manage().window().setSize(new Dimension(1200, 765));
		
		//***Métodos que definem a maximização do browser
		driver.manage().window().maximize();
		
		//***Método que define qual url navegar
		driver.get("http://www.google.com.br");
		Assert.assertEquals("Google", driver.getTitle());
		
		//***Método que finaliza a tarefa de processos dos drivers no gerenciador de tarefas. Ex.: geckodriver, chormedriver.
		driver.quit();
	}

}
