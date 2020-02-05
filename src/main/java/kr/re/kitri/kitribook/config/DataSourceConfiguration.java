
package kr.re.kitri.kitribook.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:/application.properties")
public class DataSourceConfiguration {//설정 클래스
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public HikariConfig hikariConfig() {
        return new HikariConfig();
    }

    @Bean
    public DataSource dataSource() {
        //@Bean은 컴포넌트(컨테이너에 의해 관리되는 데이터이다.)
        //여기서 데이터 소스를 만드는 거에요
        DataSource dataSource = new HikariDataSource(hikariConfig());
        System.out.println("데이터소스 로딩 성공 " + dataSource);
        return dataSource;
    }


}

