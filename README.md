# Portfolio_Online_Store
### Добро пожаловать в репозиторий тестов интернет-магазина!

## Описание проекта

Этот проект представляет собой набор автоматизированных тестов для проверки функциональности интернет-магазина с использованием фреймворка Junit5, системы управления зависимостями Maven, инструментария Selenide, отчета Allure и системы контроля версий GitHub. Проект разработан с использованием интегрированной среды разработки IntelliJ IDEA.
#  Технологии и инструменты
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white) ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)![Selenium](https://img.shields.io/badge/-selenium-%43B02A?style=for-the-badge&logo=selenium&logoColor=white)![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)![Safari](https://img.shields.io/badge/Safari-000000?style=for-the-badge&logo=Safari&logoColor=white)![Google Chrome](https://img.shields.io/badge/Google%20Chrome-4285F4?style=for-the-badge&logo=GoogleChrome&logoColor=white)
## Как начать работу с проектом

1. Установите Java Development Kit (JDK) на вашем компьютере, если его нет.
2. Скачайте и установите Maven, чтобы управлять зависимостями и запускать тесты.
3. Скачайте и установите IntelliJ IDEA для разработки и управления проектом.
4. Склонируйте репозиторий на вашем компьютере с помощью Git.

## Зависимости и настройки проекта

Для установки зависимостей и настройки проекта, выполните следующие шаги:

1. Перейдите в корневую папку проекта.
2. Откройте файл pom.xml и убедитесь, что используются актуальные версии зависимостей.
3. Выполните команду mvn clean install, чтобы установить все зависимости проекта.
  ## Приступая к работе
#### 1) Клонировать репозиторий
     git clone git@github.com:Silink2309/Portfolio_Online_Store.git
#### 2)Для запуска всех автотестов используйте
    mvn clean test
#### 3)Чтобы получить отчет allure, используйте
    mvn allure:serve
#### Запуск тестов выборочно

1. Откройте проект в IntelliJ IDEA.
2. Найдите класс тестов, который вы хотите запустить.
3. Щелкните правой кнопкой мыши на классе и выберите опцию "Run tests" или "Запустить тесты".
4. Ожидайте, пока тесты будут выполнены.
5. После выполнения тестов, сгенерируется отчет Allure Report, который можно просмотреть в браузере.



# Реализованные кейсы
1) Авторизация позитивные /негативные 
2) Регистрация позитивные /негативные
3) Изменение данный после регистрации позитивные /негативные
4) Переходы между блоками 
5) Проверка поискового поля на вывод валидных результатов  

### Дополнительные ресурсы

- Официальный сайт [Junit](https://junit.org/junit5/docs/current/user-guide/) - ознакомьтесь с документацией и руководствами по использованию Junit.
- Официальный сайт [Maven](https://maven.apache.org/users/index.html) - получите дополнительную информацию о Maven и его возможностях.
- Официальный сайт [Selenide](https://ru.selenide.org/quick-start.html) - найдите подробную документацию и примеры использования Selenide.
- Официальный сайт [Allure](https://www.allure.com/) - узнайте больше о генерации отчетов Allure.
- Официальный сайт [GitHub](https://github.com/) - получите дополнительную информацию о системе контроля версий Git и возможностях GitHub.

