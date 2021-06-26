<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>
        <h1>Выплата</h1>

        <table>
            <tr>
                <th>Id</th>
                <th>Марка Авто</th>
                <th>Размер оплаты</th>
                <th>Еденицы</th>
            </tr>
            <#list payoutList as payoutRow>
            <tr>
                <td>${payoutRow.id}</td>
                <td>${payoutRow.getCarBrand()}</td>
                <td>${payoutRow.getPayoutAmount()}</td>
                <td>${payoutRow.getPayoutUnit()}</td>
            </tr>
        </#list>
        </table>
    </body>
</html>
