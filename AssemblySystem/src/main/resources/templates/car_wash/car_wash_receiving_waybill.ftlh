<#import "../common/common.ftlh" as common />

<@common.wrapping title="Приходная накладная | Автомойка">

    <@common.header>Приходная накладная</@common.header>

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
            <#list carWashReceivingWaybillList as carWashReceivingWaybillRow>
                <tr>
                    <td>${carWashReceivingWaybillRow.id}</td>
                    <td>${carWashReceivingWaybillRow.getName()}</td>
                    <td>${carWashReceivingWaybillRow.getAmount()}</td>
                    <td>${carWashReceivingWaybillRow.getPrice()}</td>
                    <td>${carWashReceivingWaybillRow.getTotal()}</td>
                </tr>
            </#list>
        </tbody>
    </table>

</@common.wrapping>
