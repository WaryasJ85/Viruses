using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Chrome;
using System.Threading;
using OpenQA.Selenium.Interactions;
using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Support.UI;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CA_Lead_Gen_Reporting_Tool
{
    [TestClass]
    public class DevPushingAllTheButtons
    {
        [TestMethod]
        public void Pushing_All_The_Buttons_Chrome()
        {
            using (var driver = new ChromeDriver())
            {

                Actions builder = new Actions(driver);

                driver.Manage().Window.Maximize();

                driver.Navigate().GoToUrl("https://ca-dev.gmli.bluewatertech.host");

                driver.FindElementByXPath("//*[@id='NavigationMenu']/li/a").Click();

                driver.FindElementByXPath("//*[@id='Email']").SendKeys("jwaryas@bluewatertech.com");

                Thread.Sleep(1000);

                driver.FindElementByXPath("//*[@id='Password']").SendKeys("Droop420!");

                driver.FindElementByXPath("//*[@id='loginForm']/form/div[4]/div/input").Click();

                Thread.Sleep(2000);

               //This is the Administration tab that needs to be hovered over.
                var adminTab = driver.FindElement(By.XPath("//*[@id='NavigationMenu']/li[1]/span"));

                builder.MoveToElement(adminTab).Perform();
                //driver.Manage().Timeouts().ImplicitlyWait(TimeSpan.FromSeconds(10));
                Thread.Sleep(2000);

                driver.FindElementByLinkText("Events").Click();

                Thread.Sleep(3000);

                TimeSpan timeout = default;
                WebDriverWait wait = new WebDriverWait(driver, timeout);

                //driver.Navigate().Refresh();


                wait.Until(ExpectedConditions.StalenessOf(adminTab));


                builder.MoveToElement(adminTab).Perform();

                Thread.Sleep(3000);
            }
        }

    }
}
