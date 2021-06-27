<#import "../common/common.ftlh" as common />

<@common.wrapping title="Расходная накладная | Автомойка">

    <@common.header>Расходная накладная</@common.header>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Наименование моющего средства</th>
            <th>Количество</th>
            <th>Цена</th>
            <th>Сумма</th>
        </tr>
        </thead>
        <tbody>
        <#list carWashExpensingWaybillList as carWashExpensingWaybillRow>
        <tr>
            <td>${carWashExpensingWaybillRow.id}</td>
            <td>${carWashExpensingWaybillRow.getName()}</td>
            <td>${carWashExpensingWaybillRow.getAmount()}</td>
            <td>${carWashExpensingWaybillRow.getPrice()}</td>
            <td>${carWashExpensingWaybillRow.getTotal()}</td>
        </tr>
        </#list>
        </tbody>
    </table>

</@common.wrapping>
