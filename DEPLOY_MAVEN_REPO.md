# Pubblicare la API come repository Maven

La cartella `docs/` e un repository Maven statico completo ed e anche la sorgente GitHub Pages.

## GitHub Pages - configurazione consigliata

1. Carica questo progetto nel repository GitHub `upwardtechnologyit/pluingapi-repo`.
2. Vai in **Settings → Pages**.
3. In **Build and deployment → Source** scegli **Deploy from a branch**.
4. Seleziona **Branch: `main`** e **Folder: `/docs`**.
5. Premi **Save**.
6. Non serve `.github/workflows/pages.yml`: il repository contiene solo il workflow di build Maven.

La home sara:

```text
https://upwardtechnologyit.github.io/pluingapi-repo/
```

Il repository Maven da usare nei POM e:

```text
https://upwardtechnologyit.github.io/pluingapi-repo/
```

Esempio artifact:

```text
https://upwardtechnologyit.github.io/pluingapi-repo/it/upwardtechnology/gestionale/upward-plugin-api/1.1.1/upward-plugin-api-1.1.1.jar
```

## Repository nel POM

```xml
<repositories>
    <repository>
        <id>upward-plugin-api</id>
        <name>Upward Technology Plugin API</name>
        <url>https://upwardtechnologyit.github.io/pluingapi-repo/</url>
        <releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
    </repository>
</repositories>
```

## VPS senza repository remoto

In emergenza puoi ancora eseguire `./install-local.sh` per installare API e POM nel repository Maven locale. Per il deploy di un WAR gia compilato Maven non e necessario sulla VPS: il Core include l'API in `WEB-INF/lib`.
