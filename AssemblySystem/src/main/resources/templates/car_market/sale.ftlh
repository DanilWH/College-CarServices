<#import "../common/common.ftlh" as common />

<@common.wrapping title="Расходная накладная | Автомобильный рынок">

        <h1>Продажа</h1>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Марка авто</th>
                    <th>Стоимость</th>
                    <th>Регистрационный номер</th>
                    <th>Сумма</th>
                </tr>
            </thead>
            <tbody>
                <#list saleList as saleRow>
                    <tr>
                        <td>${saleRow.id}</td>
                        <td>${saleRow.getCarBrand()}</td>
                        <td>${saleRow.getCost()}</td>
                        <td>${saleRow.getRegistrationNumber()}</td>
                        <td>${saleRow.getTotal()}</td>
                    </tr>
                </#list>
            </tbody>
        </table>

</@common.wrapping>