<#import "parts/common.ftlh" as p>

<@p.page>
    <div>
        <h6>This is linker</h6>
        <link rel="stylesheet" href="./css/sstyle.css">
        <h3>Hope this one goes better :)</h3>
        <#list strings as folder>
            <div>
<#--                <p><a href="/preorder/${folder.fullLink}" name="link">${folder.name}</a></p>-->
                <p>${folder}</p>
            </div>
        </#list>
    </div>
</@p.page>