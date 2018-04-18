# homework 3 
В этом домашнем задание вам предлагается решить задачи методами,
которые мы прошли на занятие.

В файле `homework03\Tasks.kt` лежит шаблон функций, которые Вам надо
реализовать.
1. `minimalDiffDivide(array)`: разделите массив `array` на `2` части, чтобы разница
сумм элементов множеств была минимальна, в качестве ответа верните эту разницу;
2. `minimalScalarProduct(x, y)`: даны `2` вектора, можно переставлять любые координаты
одного вектора, необходимо получить минимальное скалярное произведение векторов;
3. `backpack(weight, cost, maxWeight)`: задача о рюкзаке с занятия;

Для тестирования локально:
1. В первой строке введите название функции;
2. В зависимости от аргументов, вам понадобится ввести массив или число:
    * Для массива введите его длину, а на следующей строке сам массив;
    * Для число просто введите само число в отдельной строке.

Например:
```$xslt
minimalScalarProduct
3
1 2 3
3
1 2 3
```


После того, как вы сделали задание, добавьте новую реализацию на Git, для этого
воспользуйтесь командами `git add`, `git commit` и `git push`. Например:
```$xslt
git add .
git commit -m "my solution of homework"
git push
```
Для того, чтобы сдать задание вам необходимо создать pull request в этот репозиторий,
это можно сделать прямо в браузере.

Так как основной репозиторий будет обновляться для успешного pull request необходимо
стягивать с него изменения к себе:
```$xslt
git remote add upstream https://github.com/Voudy/code_guide.git (только в 1 раз)
git pull upstream master
```

Если у вас остались какие-то вопросы, то не стесняйтесь спрашивать.