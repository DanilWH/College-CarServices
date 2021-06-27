<#import "../common/common.ftlh" as common />

<@common.wrapping title="Расходная накладная | Авто сервис">

    <@common.header>Расходная накладная</@common.header>

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
            <#list expensingWaybillList as expensingWaybillRow>
                <tr>
                    <td>${expensingWaybillRow.id}</td>
                    <td>${expensingWaybillRow.getName()}</td>
                    <td>${expensingWaybillRow.getAmount()}</td>
                    <td>${expensingWaybillRow.getPrice()}</td>
                    <td>${expensingWaybillRow.getTotal()}</td>
                </tr>
            </#list>
        </tbody>
    </table>

</@common.wrapping>
