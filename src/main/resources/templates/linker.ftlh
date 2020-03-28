<#import "parts/common.ftlh" as p>

<@p.page>
    <div>
        <h6>This is linker</h6>
        <#list folders as folder>
            <div>
                <p><a href="/linker/${folder.shortLink}">${folder.linkName}</a></p>
            </div>
        </#list>
    </div>
</@p.page>