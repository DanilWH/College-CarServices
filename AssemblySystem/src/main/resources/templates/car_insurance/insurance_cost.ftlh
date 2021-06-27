<#import "../common/common.ftlh" as common />

<@common.wrapping title="Стоимость страховки | Страховочная компания">

    <@common.header>Стоимость страховки</@common.header>

    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Стоимость</th>
            <th>Стаж вождения</th>
            <th>Количество ДТП</th>
            <th>Прибыль автосалона</th>
        </tr>
        <#list insuranceCostList as insuranceCostRow>
        <tr>
            <td>${insuranceCostRow.id}</td>
            <td>${insuranceCostRow.getCost()}</td>
            <td>${insuranceCostRow.getDrivingAge()}</td>
            <td>${insuranceCostRow.getAccidentNumber()}</td>
            <td>${insuranceCostRow.getCarsalonIncome()}</td>
        </tr>
    </#list>
    </table>

</@common.wrapping>