# Upward Plugin API 1.0.0

API pubblica stabile per i plugin di Upward Gestionale (Java 21).

## Coordinate Maven

```xml
<dependency>
  <groupId>it.upwardtechnology.gestionale</groupId>
  <artifactId>upward-plugin-api</artifactId>
  <version>1.0.0</version>
</dependency>
```

Nei plugin usa `scope=provided`: l'API viene fornita dal Core a runtime.

## Principi 1.0

- il plugin non dipende dai DAO/controller interni del Core;
- ogni capability funzionale Core viene esposta tramite `PluginContext.services()`;
- ogni modulo puo essere esteso tramite `ModuleExtensionRegistry`;
- Agenda supporta profili multipli (`core.default`, `giardinieri.lavori`, `ordini`, ecc.) con workflow diversi;
- permessi, route, CSRF, audit e visibilita restano controllati dal Core;
- i plugin possono avere configurazione, storage, migrazioni e tabelle proprie;
- la serie 1.x non rimuove o cambia firme pubbliche esistenti. Breaking change => 2.0.

## Installazione locale immediata

Windows PowerShell:

```powershell
./install-local.ps1
```

Linux/macOS/VPS:

```bash
chmod +x install-local.sh
./install-local.sh
```

Gli script copiano JAR e POM nel repository Maven locale `~/.m2/repository` senza richiedere il comando Maven.

## Pubblicazione online

Il repository include una cartella `maven-repo/` gia pronta da pubblicare con GitHub Pages/Nginx/S3. Vedi `DEPLOY_MAVEN_REPO.md`.

## Reference Plugin

`reference-plugin/` dimostra compatibilita legacy (permessi/widget) e API 1.0 (Agenda Lavori + workflow + navigazione).
