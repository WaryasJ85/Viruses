using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Interactions;
using System.Threading;

namespace GM_Wheel_Stands
{
    [TestClass]
    public class DEV_US_CMS_Button_Pushing
    {
        [TestMethod]
        public void TestMethod1()
        {
            using (var driver = new ChromeDriver())
            {

                Actions builder = new Actions(driver);

                driver.Manage().Window.Maximize();

                driver.Navigate().GoToUrl("https://us-dev.ws.gm.bluewatertech.host");

                //Enter username/email for the website
                driver.FindElementByXPath("//*[@id='Email']").SendKeys("jwaryas@bluewatertech.com");

                // Password for that user
                driver.FindElementByXPath("//*[@id='Password']").SendKeys("Droop420!");

                Thread.Sleep(2000);

                //Log In button
                driver.FindElementByCssSelector("#loginForm > form > div:nth-child(6) > div > input").Click();

                Thread.Sleep(2000);

                //Stero button selection for WS World
                driver.FindElementByXPath("//*[@value='WLD']").Click();

                Thread.Sleep(4000);

                //Selects the log in button for the country.
                driver.FindElementById("btnLogin").Click();

                Thread.Sleep(2000);

                //Selects the color tab
                driver.FindElementByXPath("/html/body/div[1]/div/div/div[2]/div/ul/li[2]/a").Click();

                Thread.Sleep(2000);

                //Clicking add color
                driver.FindElementByXPath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/div/a").Click();

                Thread.Sleep(2000);

                //Clicking back
                driver.FindElementByXPath("/html/body/div[1]/div/div/div/form/a").Click();

                Thread.Sleep(2000);

                //Clicking the Vehicles button
                driver.FindElementByXPath("/html/body/div[1]/div/div/div[2]/div/ul/li[1]/a").Click();

                Thread.Sleep(2000);

                //Navigates to the WheelStands World metrics
                driver.Navigate().GoToUrl("https://us-dev.ws.gm.bluewatertech.host/?country=WLD#!/metrics");

                Thread.Sleep(2000);

                //Selects the general metrics button
                driver.FindElementByXPath("/html/body/div[1]/div/div/div/div[3]/div[2]/a").Click();

                Thread.Sleep(2000);

                //Selects the Dwell time metrics button
                driver.FindElementByXPath("/html/body/div[1]/div/div/div/div[3]/div[3]/a").Click();

                Thread.Sleep(2000);

                //Selects the back button
                driver.FindElementByXPath("/html/body/div[1]/div/div/div/div[3]/div[1]/a").Click();

                Thread.Sleep(2000);

                //selects the add vehicle button
                driver.FindElementByXPath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div/a").Click();

                Thread.Sleep(2000);



                //Selects the log out button
                driver.FindElementByXPath("/html/body/footer/div[4]/button").Click();



                Thread.Sleep(5000);



            }


        }
    }
}
