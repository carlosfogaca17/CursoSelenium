import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCampoTreinamento {
	
	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\�rea de Trabalho\\Backup Foga�a\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\�rea de Trabalho\\Backup Foga�a\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\�rea de Trabalho\\Backup Foga�a\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//***M�todo que define qual url navegar.
		//driver.get("http://www.google.com.br");
		
		//***Usando o m�todo driver.get dessa forma ele navegar� pelo o arquivo .html que estiver no caminho indicado abaixo.
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		//***Propriedade que mostra o local exato onde o Java est� rodando
		//System.getProperty("user.dir");
		
		//***M�todo que finaliza a tarefa de processos dos drivers no gerenciador de tarefas. Ex.: geckodriver, chormedriver.
		//driver.quit();
		//testando o commit
	}

}
