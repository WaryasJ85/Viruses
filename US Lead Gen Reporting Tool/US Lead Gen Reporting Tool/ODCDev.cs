using System.Threading;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.IE;
using OpenQA.Selenium.Interactions;
using Selenium.WebDriver;

namespace US_Lead_Gen_Reporting_Tool
{
    [TestClass]
    public class ODCDev
    {
        [TestMethod]
        public void InernetExplorer()
        {
            using (var driver = new InternetExplorerDriver())
            {

                //This section is to start the browser and launch the web site
                //driver.Manage().Window.Maximize();

                driver.Navigate().GoToUrl("https://us-dev.gmli2.bluewatertech.host/ProductInformation");

                Thread.Sleep(1000);

                driver.FindElementById("NavigationMenu_mn_active").Click();

                Thread.Sleep(5000);

                driver.FindElementById("csrFirstName").SendKeys("Test");

                Thread.Sleep(5000);









            }
        }
    }
}
