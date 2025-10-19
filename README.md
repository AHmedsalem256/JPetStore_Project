🧪 JPetStore Test Automation Framework
📋 Overview

This project automates the functional test cases of the JPetStore Demo Website
 using Java, Selenium WebDriver, and the Page Object Model (POM) design pattern.

It combines multiple testing approaches to ensure a scalable, maintainable, and data-driven test automation framework, including:

POM architecture for separation of concerns

Data-Driven Testing (DDT) for test reusability and flexibility

Behavior-Driven Development (BDD) for high-level scenario validation:

⚙️ Tech Stack
Category	Tools / Frameworks
Programming Language	Java (JDK 21+)
Test Framework	TestNG / Cucumber (BDD)
Automation Tool	Selenium WebDriver
Build Tool	Maven
Reporting	Allure Reports
Design Pattern	Page Object Model (POM)
Data Source	Excel / CSV / JSON (depending on your implementation)
IDE	IntelliJ IDEA / Eclipse

🧠 Project Structure
```
src
├── main
│   ├── java
│   │   └── Pages
│   │       ├── AuthenticationPage.java
│   │       ├── BasePage.java
│   │       ├── CatalogPage.java
│   │       ├── HomePage.java
│   │       ├── ProductDetailPage.java
│   │       ├── SearchPage.java
│   │       ├── ShoppingCartPage.java
│   │       └── UserRegistrationPage.java
│   └── resources
│       └── properties/
│           └── config.properties
│
└── test
    └── java
        ├── Data/
        │   └── TestData.xlsx
        └── Tests/
            ├── AuthinticationTest.java
            ├── BaseTest.java
            ├── CatalogTest.java
            ├── HomeModuleTest.java
            ├── ProductDetailTest.java
            ├── SearchTest.java
            ├── ShoppingCartTest.java
            └── UserRegistrationTest.java
```


🚀 Features

✅ Automated Functional Test Cases for user flows:

User Login & Logout

Product Search & Add to Cart

Checkout Process

Account Management

✅ Page Object Model (POM) for cleaner and maintainable code
✅ Data-Driven Testing (DDT) using external data sources
✅ BDD Scenarios implemented using Cucumber and Gherkin syntax
✅ Cross-browser Testing Support
✅ Detailed Allure Reporting



⚡ Setup Instructions
1️⃣ Clone the repository
git clone https://github.com/your-username/JPetStore-Automation.git
cd JPetStore-Automation
2️⃣ Install dependencies
mvn clean install
3️⃣ Run TestNG tests
mvn test



📊 Reports

Allure Reports provide:

📈 Execution summary
✅ Pass/❌ Fail statistics
🖼️ Screenshots on failure
🧩 Step-by-step logs
📜 Historical trends



🧑‍💻 Author

Ahmed Salem
💼 QA Automation Engineer | DevOps Enthusiast
📧 linkedin.com/in/ahmed-salem-8380111b8
🌐 ahmed.salem.mohamed.2002@gmail.com

🔮 Future Enhancements

✅ Integrate with Jenkins / GitHub Actions CI/CD

✅ Add API Test Layer (RestAssured)

✅ Implement Parallel Execution with TestNG suites

✅ Dockerized Selenium Grid for cross-browser runs


📝 License

This project is licensed under the MIT License – see the LICENSE
 file for details.

allure serve allure-results

