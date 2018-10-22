using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using OpenQA.Selenium.Chrome;

namespace TestProject1
{
    [TestClass]
    public class GoogleSearchChrome
    {
        [TestMethod]
        public void Should_Search_Using_Chrome()
        {
            //Start the chrome driver
            using (var driver = new ChromeDriver())
            {
               //1. Maximize window
                driver.Manage().Window.Maximize();

                //2. Enter URL
                driver.Navigate().GoToUrl("https://www.google.com");

                //3. Find Search box by Id
                var searchBox = driver.FindElementById("lst-ib");

                //4. Enter Text
                searchBox.SendKeys("Automation useing Selenium in C#");

                //5. Find Search
                var searchButton = driver.FindElementByName("btnK");

                //6. Click Search
                searchButton.Submit();

                //7. Find the "Id" of the "Div" Containing Result Stats
                var searchResults = driver.FindElementById("resultStats");

            }

        }
    }
}
