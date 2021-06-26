<#import "../common/common.ftlh" as common />

<@common.wrapping title="Приходная накладная | Автомобильный салон">
    <h1>Приходная накладная</h1>

    <table class="table table-striped">
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
            <#list receivingNomenclatureList as receivingNomenclatureRow>
                <tr>
                    <td>${receivingNomenclatureRow.id}</td>
                    <td>${receivingNomenclatureRow.getCarBrand()}</td>
                    <td>${receivingNomenclatureRow.getAmount()}</td>
                    <td>${receivingNomenclatureRow.getPrice()}</td>
                    <td>${receivingNomenclatureRow.getTotal()}</td>
                </tr>
            </#list>
        </tbody>
    </table>

</@common.wrapping>