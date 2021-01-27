package com.github.boyarsky1997.greenhouse;

/***
 *1. Created an XML file and the corresponding XSD schema.м
 * 2. При разработке XSD использовать простые и комплексные типы, перечи-
 * сления, шаблоны и предельные значения.
 * 3. Сгенерировать класс, соответствующий данному описанию.
 * 4. Создать приложение для разбора XML-документа и инициализации кол-
 * лекции объектов информацией из XML-файла. Для разбора использовать
 * SAX, DOM и StAX парсеры. Для сортировки объектов использовать интер-
 * фейс Comparator.
 * 5. Произвести проверку XML-документа с привлечением XSD.
 * 6. Определить метод, производящий преобразование разработанного XML-
 * документа в документ, указанный в каждом задании.
 * --------------------------------------------------------------------
 * Оранжерея.
 * Растения, содержащиеся в оранжерее, имеют следующие характеристики:
 * ——Name — название растения;
 * ——Soil — почва для посадки, которая может быть следующих типов: под-
 * золистая, грунтовая, дерново-подзолистая;
 * ——Origin — место происхождения растения;
 * ——Visual рarameters (должно быть несколько) — внешние параметры: цвет
 * стебля, цвет листьев, средний размер растения;
 * ——Growing tips (должно быть несколько) — предпочтительные условия
 * произрастания: температура (в градусах), освещение (светолюбиво либо
 * нет), полив (мл в неделю);
 * ——Multiplying — размножение: листьями, черенками либо семенами.
 * Корневой элемент назвать Flower.
 * С помощью XSL преобразовать XML-файл в формат HTML, где отобра-
 * зить растения по предпочитаемой температуре
 * (по возрастанию).
 */
public class Main {
    public static void main(String[] args) {
        boolean b = XMLValidation.validateXMLSchema("src\\main\\resources\\greenhouse.xsd", "src\\main\\resources\\greenhouse.xml");
        System.out.println(b);

    }
}
