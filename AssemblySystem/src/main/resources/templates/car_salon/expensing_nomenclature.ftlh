<#import "../common/common.ftlh" as common />

<@common.wrapping title="Расходная накладная | Автомобильный рынок">

    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Марка автомобиля</th>
            <th>Количество</th>
            <th>Цена</th>
            <th>Сумма</th>
        </tr>
        </thead>
        <tbody>
        <#list expensingNomenclatureList as expensingNomenclatureRow>
        <tr>
            <td>${expensingNomenclatureRow.id}</td>
            <td>${expensingNomenclatureRow.getCarBrand()}</td>
            <td>${expensingNomenclatureRow.getAmount()}</td>
            <td>${expensingNomenclatureRow.getPrice()}</td>
            <td>${expensingNomenclatureRow.getTotal()}</td>
        </tr>
        </#list>
        </tbody>
    </table>

</@common.wrapping>