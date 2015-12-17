package mp3000;

import java.io.File;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		for (String filename : args.getNonOptionArgs()) {
			File root = new File(filename);
			for (File file : root.listFiles()) {
				if (file.isDirectory()) {
					process(file);
				}
			}
			System.out.println(filename);
		}
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	private void process(File dir) {
		System.out.println(dir.getName());
	}

}
