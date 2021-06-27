<#import "../common/common.ftlh" as common />

<@common.wrapping title="Моющие средства| Справочники">

<@common.header>Моющие средства</@common.header>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Id</th>
        <th>Название моющего средства</th>
    </tr>
    </thead>
    <tbody>
        <#list detergentsList as detergentsRow>
            <tr>
                <td>${detergentsRow.id}</td>
                <td>${detergentsRow.getDetergentName()}</td>
            </tr>
        </#list>
    </tbody>
</table>

</@common.wrapping>
