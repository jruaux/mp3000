package mp3000;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class Config {

	private String file;

	public String getFiles() {
		return file;
	}

	public void setFiles(String file) {
		this.file = file;
	}
}