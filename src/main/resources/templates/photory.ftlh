<#import "parts/common.ftlh" as c>
<@c.page>

    <div>
        <span>Page is Working</span>
        <#list photories as photory>
            <div>
                <strong>${photory}</strong>
            </div>
        </#list>
    </div>
</@c.page>