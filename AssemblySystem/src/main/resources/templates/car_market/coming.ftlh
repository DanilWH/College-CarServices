<!DOCTYPE html>
<html>
    <head>
        <title>Приход | Авто базар</title>
    </head>
    <body>
        <h1>Приход</h1>

        <table>
            <tr>
                <th>Id</th>
                <th>Марка авто</th>
                <th>Категория</th>
                <th>Наименование ТС</th>
                <th>Регистрационный номер</th>
                <th>Стоимость</th>
                <th>Пробег</th>
            </tr>

            <#list comingList as comingRow>
                <tr>
                    <td>${comingRow.id}</td>
                    <td>${comingRow.getCarBrand()}</td>
                    <td>${comingRow.getCategory()}</td>
                    <td>${comingRow.getVehicleName()}</td>
                    <td>${comingRow.getRegistrationNumber()}</td>
                    <td>${comingRow.getCost()}</td>
                    <td>${comingRow.getMileage()}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>