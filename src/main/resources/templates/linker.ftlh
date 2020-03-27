<#import "parts/common.ftlh" as p>

<@p.page>
    <div>
        <h6>This is linker</h6>
        <#list folders as folder>
            <div>
                <p><a href="/linker/${folder.fullLink}">${folder.name}</a></p>
            </div>
        </#list>
    </div>
</@p.page>