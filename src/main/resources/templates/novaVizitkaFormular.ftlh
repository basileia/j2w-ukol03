[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body class="body-formular">
<form action="/nova" method="post" class="row g-3 formular">
  <h2 class="mt-5 mb-3" >Nová vizitka</h2>
  <div class="col-md-8">
    <label for="jmeno" class="form-label">Jméno a příjmení*</label>
    <input id="jmeno" name="jmeno" class="form-control" type="text"/>
  </div>
  <div class="col-md-8">
    <label for="firma" class="form-label">Firma*</label>
    <input id="firma" name="firma" class="form-control" type="text"/>
  </div>
  <div class="col-md-8">
    <label for="ulice" class="form-label">Ulice*</label>
    <input id="ulice" name="ulice" class="form-control" type="text"/>
  </div>
  <div class="col-md-8">
    <label for="obec-psc" class="form-label">PSČ a obec*</label>
    <input id="obec-psc" name="obecPsc" class="form-control" type="text"/>
  </div>
  <div class="col-md-8">
    <label for="email" class="form-label">Email</label>
    <input id="email" name="email" class="form-control" type="text"/>
  </div>
  <div class="col-md-8">
    <label for="telefon" class="form-label">Telefon</label>
    <input id="telefon" name="telefon" class="form-control" type="text"/>
  </div>
  <div class="col-md-8">
    <label for="web" class="form-label">Web</label>
    <input id="web" name="web" class="form-control" type="text"/>
  </div>
  <div class="col-md-8">
    <p>*povinný údaj</p>
  </div>
  <div class="col-md-8">
    <button type="submit" class="btn btn-primary">Potvrdit</button>
  </div>
</form>


</body>
</html>