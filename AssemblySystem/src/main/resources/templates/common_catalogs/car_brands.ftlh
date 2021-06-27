<#import "../common/common.ftlh" as common />

<@common.wrapping title="Автомобильные марки | Справочники">

<@common.header>Автомобильные марки</@common.header>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Id</th>
        <th>Марка</th>
    </tr>
    </thead>
    <tbody>
        <#list carBrandsList as carBrandsRow>
            <tr>
                <td>${carBrandsRow.id}</td>
                <td>${carBrandsRow.getBrand()}</td>
            </tr>
        </#list>
    </tbody>
</table>

</@common.wrapping>