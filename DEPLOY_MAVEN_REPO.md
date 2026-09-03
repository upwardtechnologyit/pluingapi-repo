# Pubblicare la API come repository Maven

La cartella `maven-repo/` e un repository Maven statico completo.

## GitHub Pages
1. Crea un repository, ad esempio `upward-plugin-api`.
2. Carica tutto il progetto.
3. Abilita GitHub Pages tramite Actions.
4. Il workflow `.github/workflows/pages.yml` pubblica automaticamente `maven-repo/`.
5. Nel POM del Gestionale aggiungi il repository Pages ottenuto e la dipendenza 1.0.0.

## VPS senza repository remoto
Copia lo ZIP API sulla VPS ed esegui `./install-local.sh`, poi compila il Gestionale normalmente.

Per il deploy di un WAR gia compilato non serve Maven sulla VPS: la API viene inclusa in `WEB-INF/lib` dal build del Core.
