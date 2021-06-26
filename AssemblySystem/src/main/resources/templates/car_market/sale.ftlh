<!DOCTYPE html>
<html>
    <head>
        <title>Продажа | Авто базар</title>
    </head>
    <body>
        <h1>Продажа</h1>

        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Марка авто</th>
                    <th>Стоимость</th>
                    <th>Регистрационный номер</th>
                    <th>Сумма</th>
                </tr>
            </thead>
            <tbody>
                <#list saleList as saleRow>
                    <tr>
                        <td>${saleRow.id}</td>
                        <td>${saleRow.getCarBrand()}</td>
                        <td>${saleRow.getCost()}</td>
                        <td>${saleRow.getRegistrationNumber()}</td>
                        <td>${saleRow.getTotal()}</td>
                    </tr>
                </#list>
            </tbody>
        </table>
    </body>
</html>