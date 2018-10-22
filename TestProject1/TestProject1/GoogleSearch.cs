using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Firefox;

namespace TestProject1
{
    [TestClass]
    public class GoogleSearch
    {
        [TestMethod]
        public void Should_Search_Using_Firefox()
        {

            //Initialize the Chrome Driver
            using (var driver = new FirefoxDriver())
            {
                //1. Maximize the browser
                driver.Manage() .Window.Maximize();

                //2. Go to URL
                driver.Navigate().GoToUrl("https://google.com");

                //3. Find the search Text box
                var searchBox = driver.FindElementById("lst-ib");

                //4. Enter Text
                searchBox.SendKeys("Automation Using Selenium 3.0 in C#");

                //5. Find search button by name
                var searchButton = driver.FindElementByName("btnK");

                //6. Click Search button
                searchButton.Submit();

                //Find the"Id" of the "Div" containing results stats,
                // located just above the results table.
                var searchResults = driver.FindElementById("resultStats");
            }
        }
    }
}
