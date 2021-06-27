<#import "../common/common.ftlh" as common />

<@common.wrapping title="Оплата | Страховочная компания">

        <@common.header>Оплата</@common.header>

        <table class="table table-striped">
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

</@common.wrapping>