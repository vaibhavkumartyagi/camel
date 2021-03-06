/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.HealthCheckConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HealthCheckConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("Enabled", boolean.class);
        map.put("FailureThreshold", int.class);
        map.put("Interval", long.class);
        map.put("Parent", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(HealthCheckConfigurationPropertiesConfigurer::clearBootstrapConfigurers);
        ConfigurerStrategy.addConfigurerClearer(HealthCheckConfigurationPropertiesConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.HealthCheckConfigurationProperties target = (org.apache.camel.main.HealthCheckConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "enabled":
        case "Enabled": target.setEnabled(property(camelContext, boolean.class, value)); return true;
        case "failurethreshold":
        case "FailureThreshold": target.setFailureThreshold(property(camelContext, int.class, value)); return true;
        case "interval":
        case "Interval": target.setInterval(property(camelContext, long.class, value)); return true;
        case "parent":
        case "Parent": target.setParent(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
        ALL_OPTIONS.clear();
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.HealthCheckConfigurationProperties target = (org.apache.camel.main.HealthCheckConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "enabled":
        case "Enabled": return target.isEnabled();
        case "failurethreshold":
        case "FailureThreshold": return target.getFailureThreshold();
        case "interval":
        case "Interval": return target.getInterval();
        case "parent":
        case "Parent": return target.getParent();
        default: return null;
        }
    }
}

