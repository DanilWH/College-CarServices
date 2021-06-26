<#import "../common/common.ftlh" as common />

<@common.wrapping title="">

    <h1>Стоимость страховки</h1>

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