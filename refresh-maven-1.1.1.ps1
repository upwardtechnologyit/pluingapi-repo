$ErrorActionPreference = "Stop"
$ApiDir = Join-Path $HOME ".m2\repository\it\upwardtechnology\gestionale\upward-plugin-api\1.1.1"
if (Test-Path $ApiDir) {
    Remove-Item -Recurse -Force $ApiDir
    Write-Host "Cache Maven 1.1.1 rimossa: $ApiDir"
}
Write-Host "Ora in Eclipse: tasto destro progetto -> Maven -> Update Project... -> spunta Force Update of Snapshots/Releases -> OK"
