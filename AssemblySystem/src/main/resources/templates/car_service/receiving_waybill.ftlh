<#import "../common/common.ftlh" as common />

<@common.wrapping title="Приходная накладная | Авто сервис">
    <h1>Приходная накладная</h1>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Наименование</th>
            <th>Количество</th>
            <th>Цена</th>
            <th>Сумма</th>
        </tr>
        </thead>
        <tbody>
            <#list receivingWaybillList as receivingWaybillRow>
                <tr>
                    <td>${receivingWaybillRow.id}</td>
                    <td>${receivingWaybillRow.getName()}</td>
                    <td>${receivingWaybillRow.getAmount()}</td>
                    <td>${receivingWaybillRow.getPrice()}</td>
                    <td>${receivingWaybillRow.getTotal()}</td>
                </tr>
            </#list>
        </tbody>
    </table>

</@common.wrapping>
