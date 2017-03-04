package com.bupt.poirot.configurations;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.sync.ReadWriteSynchronizer;
import org.apache.logging.log4j.core.config.properties.PropertiesConfigurationBuilder;

import java.io.File;
import java.util.List;

/**
 * Created by hui.chen on 3/3/17.
 */
public class ConfigurationInit {
    public static void main(String[] args) {
        Configurations configs = new Configurations();
        try {
            FileBasedConfigurationBuilder<PropertiesConfiguration> propertiesBuilder = configs.fileBasedBuilder(PropertiesConfiguration.class,"config.properties");
            Configuration config = propertiesBuilder.getConfiguration();
            System.out.println(config.getInt("age"));
            System.out.println(config.getString("name"));
            config.setProperty("first_name", "chen");
            config.setProperty("last_name", "hui");
            propertiesBuilder.save();
            config.setSynchronizer(new ReadWriteSynchronizer());

            Parameters parameters = new Parameters();
            parameters.basic().setSynchronizer(new ReadWriteSynchronizer());


            Configuration xmlConfig = configs.xml(new File("paths.xml"));
            List<String> list = xmlConfig.getList(String.class,"processing.paths.path");
            list.stream().forEach(System.out::println);

            System.out.println(xmlConfig.getString("processing[@stage]"));
            System.out.println(xmlConfig.getString("processing.paths.path(2)"));
        }
        catch (ConfigurationException cex)
        {
            // Something went wrong
        }
    }
}
