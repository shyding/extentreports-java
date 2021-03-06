package com.aventstack.extentreports.reporter;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LoggerRichViewReporterConfigurationTest {

    @Test
    public void testHtmlReporterUserConfigEnableTimelineEnabled(Method method) {
        ExtentLoggerReporter logger = new ExtentLoggerReporter(method.getName() + ".html");
        logger.config().enableTimeline(true);
        String v = (String) logger.getConfigurationStore().getConfig("enableTimeline");
        Assert.assertEquals(v, String.valueOf(true));
    }
    
    @Test
    public void testHtmlReporterUserConfigEnableTimelineDisabled(Method method) {
        ExtentLoggerReporter logger = new ExtentLoggerReporter(method.getName() + ".html");
        logger.config().enableTimeline(false);
        String v = (String) logger.getConfigurationStore().getConfig("enableTimeline");
        Assert.assertEquals(v, String.valueOf(false));
    }
/*    
    @Test
    public void testHtmlReporterUserConfigAutoConfigMediaEnabled(Method method) {
        ExtentLoggerReporter logger = new ExtentLoggerReporter(method.getName() + ".html");
        logger.config().setAutoCreateRelativePathMedia(true);
        String v = (String) logger.getConfigurationStore().getConfig("autoCreateRelativePathMedia");
        Assert.assertEquals(v, String.valueOf(true));
    }
    
    @Test
    public void testHtmlReporterUserConfigAutoConfigMediaDisabled(Method method) {
        ExtentLoggerReporter logger = new ExtentLoggerReporter(method.getName() + ".html");
        logger.config().setAutoCreateRelativePathMedia(false);
        String v = (String) logger.getConfigurationStore().getConfig("autoCreateRelativePathMedia");
        Assert.assertEquals(v, String.valueOf(false));
    }
*/    
    @Test
    public void testHtmlReporterUserConfigDetaultProtocol(Method method) {
        ExtentLoggerReporter logger = new ExtentLoggerReporter(method.getName() + ".html");
        String v = (String) logger.getConfigurationStore().getConfig("protocol");
        Assert.assertEquals(Enum.valueOf(Protocol.class, v.toUpperCase()), Protocol.HTTPS);
    }
    
    @Test
    public void testHtmlReporterUserConfigProtocolSetting(Method method) {
        ExtentLoggerReporter logger = new ExtentLoggerReporter(method.getName() + ".html");
        logger.config().setProtocol(Protocol.HTTP);
        String v = (String) logger.getConfigurationStore().getConfig("protocol");
        Assert.assertEquals(Enum.valueOf(Protocol.class, v.toUpperCase()), Protocol.HTTP);
    }
    
    @Test
    public void testHtmlReporterUserConfigDetaultTheme(Method method) {
        ExtentLoggerReporter logger = new ExtentLoggerReporter(method.getName() + ".html");
        String v = (String) logger.getConfigurationStore().getConfig("theme");
        Assert.assertEquals(Enum.valueOf(Theme.class, v.toUpperCase()), Theme.STANDARD);
    }
    
    @Test
    public void testHtmlReporterUserConfigThemeSetting(Method method) {
        ExtentLoggerReporter logger = new ExtentLoggerReporter(method.getName() + ".html");
        logger.config().setTheme(Theme.DARK);
        String v = (String) logger.getConfigurationStore().getConfig("theme");
        Assert.assertEquals(Enum.valueOf(Theme.class, v.toUpperCase()), Theme.DARK);
    }
    
}
