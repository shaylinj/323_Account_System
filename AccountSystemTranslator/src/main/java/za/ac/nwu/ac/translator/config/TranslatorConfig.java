package za.ac.nwu.ac.translator.config;

import config.RepoConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({RepoConfig.class})
@Configuration
@ComponentScan(basePackages = {"za.ac.nwu.ac.translator"})
public class TranslatorConfig {
}
