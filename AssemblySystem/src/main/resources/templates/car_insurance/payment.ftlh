<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>
        <h1>Оплата</h1>

        <table>
            <tr>
                <th>Id</th>
                <th>Марка Авто</th>
                <th>Размер оплаты</th>
                <th>Еденицы</th>
            </tr>
            <#list paymentList as paymentRow>
                <tr>
                    <td>${paymentRow.id}</td>
                    <td>${paymentRow.getCarBrand()}</td>
                    <td>${paymentRow.getPaymentAmount()}</td>
                    <td>${paymentRow.getPaymentUnit()}</td>
                </tr>
        </#list>
        </table>
    </body>
</html>