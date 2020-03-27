<#import "parts/common.ftlh" as c>
<@c.page>
<#--    <#assign alps = "http://localhost:8080/alps/all">-->
    <script
            src="https://code.jquery.com/jquery-3.4.1.js"
            integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
            crossorigin="anonymous"></script>
    <p><b>Results:</b> <span id="results"></span></p>
    <form action="/im" >
        <fieldset id="XXX" class="checkboxes">
    <div class="row row-cols-1 row-cols-3">
        <#list alps as alp>
            <div class="col-4 mb-4">
                <div class="card text-white bg-dark">
                    <input type="checkbox" id="cb+${alp.getName()}" name="ccd" value="${alp.name}" class="checkbox">
                    <label for="cb+${alp.getName()}">
                        <img src="img${alp.getPath()}" class="card-img-top" alt="${alp.getPath()}">
                    </label>


                    <div class="card-body">
                        <p class="card-text small">Short name: ${alp.getName()}</p>
                    </div>
                </div>
            </div>
        </#list>
        <div id="foot">
            Tr
        </div>
    </div>
        </fieldset>
    </form>
    <script>
        // $('input[type="checkbox"]').change(function(){
        //     $('#YYY')
        //         .val($('input[type="checkbox"]:checked')
        //             .map(function(){
        //                 return this.value;
        //             }).get().join(', '));
        // }).change();
        var ff;
        function showValues() {
            ff = $( ":input" ).serializeArray();
            $( "#results" ).empty();
            jQuery.each( ff, function( i, field ) {
                $( "#results" ).append( field.value + " " );
            });
        }

        $(":checkbox").click( showValues );
        function ale(){
            let all = JSON.stringify(ff);
            alert(all);
        }
    </script>
    <div id="WWW" class="QQQ">
        <textarea id="YYY" name="user_chosen_group_tag" cols="25" rows="3" class="inputbox textarea validate[maxSize[255]]"></textarea>
    </div>
</@c.page>