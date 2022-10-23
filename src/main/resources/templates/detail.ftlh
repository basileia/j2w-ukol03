[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>

<div class="detail">
    <div class="vizitka">
        <div class="jmeno">${vizitka.jmeno}</div>
        <div class="firma">${vizitka.firma}</div>
        <div class="udaje">
            <div class="adresa">
                <div>${vizitka.ulice}</div>
                <div>${vizitka.obecPsc}</div>
            </div>
            <div class="kontakty">
                [#if vizitka.email?exists]
                    <div><i class="las la-at"></i> <span>${vizitka.email}</span></div>
                [/#if]
                [#if vizitka.telefon?exists]
                    <div><i class="las la-phone-alt"></i> <span>${vizitka.telefon}</span></div>
                [/#if]
                [#if vizitka.web?exists]
                    <div><i class="las la-globe"></i> <span>${vizitka.web}</span></div>
                [/#if]
            </div>
        </div>
    </div>

    <div class="mapa">
        <iframe style="border:none" src="https://frame.mapy.cz/?q=${vizitka.celaAdresa?url}" width="100%" height="100%" frameborder="0"></iframe>
    </div>

    <nav class="navbar">
        <a href="/">◂ Zpět na seznam</a>
        <form action="/delete" method="post">
            <input type="hidden" name="vizitkaId" value="${vizitka.vizitkaId}" />
            <button type="submit" class="button-remove">Smazat</button>
        </form>
    </nav>

</div>
</body>
</html>
