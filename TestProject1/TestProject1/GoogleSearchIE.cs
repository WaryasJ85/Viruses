using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.IE;

namespace TestProject1
{
    [TestClass]
    public class GoogleSearchIE
    {
        [TestMethod]
        public void Should_Search_Using_Internet_Explorer()
        {
            //Start IE Web driver
            using (var driver = new InternetExplorerDriver())
            {
                //1. Maximize Window
                driver.Manage().Window.Maximize();

                //2. Enter URL
                driver.Navigate().GoToUrl("https://www.google.com");

                //3. Find Text box
                //driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(10);

                var searchBox = driver.FindElementById("lst-ib");

                //4. Set Text
                searchBox.SendKeys("Why is chrome much better");

                //5. Find the search button
                var searchButton = driver.FindElementsByName("btnK");

                //driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(10);

                //6. Click Searh Button
                searchButton.submit();

                //7. Find the "Id" of the "Div" containin the results stats
                var searchResults = driver.FindElementById("resultStats");
            }

        }
    }
}
