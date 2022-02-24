import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCampoTreinamento {
	
	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\Área de Trabalho\\Backup Fogaça\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\Área de Trabalho\\Backup Fogaça\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Svlabs\\OneDrive - SVLabs\\Área de Trabalho\\Backup Fogaça\\Profissional_Pessoal\\Curso Selenium\\Selenium WebDriver\\driver\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		//***Método que define qual url navegar.
		//driver.get("http://www.google.com.br");
		
		//***Usando o método driver.get dessa forma ele navegará pelo o arquivo .html que estiver no caminho indicado abaixo.
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		//***Propriedade que mostra o local exato onde o Java está rodando
		//System.getProperty("user.dir");
		
		//***Método que finaliza a tarefa de processos dos drivers no gerenciador de tarefas. Ex.: geckodriver, chormedriver.
		//driver.quit();
		//testando o commit
	}

}
