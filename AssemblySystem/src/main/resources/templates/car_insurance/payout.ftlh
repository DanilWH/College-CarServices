<!DOCTYPE html>
<#import "../common/common.ftlh" as common />

<@common.wrapping title="Расходная накладная | Автомобильный рынок">

        <h1>Выплата</h1>

        <table class="table table-striped">
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

</@common.wrapping>