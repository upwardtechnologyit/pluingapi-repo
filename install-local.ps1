$ErrorActionPreference = "Stop"
$Root = Split-Path -Parent $MyInvocation.MyCommand.Path
$Dest = Join-Path $HOME ".m2\repository\it\upwardtechnology\gestionale\upward-plugin-api\1.1.1"
New-Item -ItemType Directory -Force -Path $Dest | Out-Null
Copy-Item (Join-Path $Root "upward-plugin-api-1.1.1.jar") (Join-Path $Dest "upward-plugin-api-1.1.1.jar") -Force
Copy-Item (Join-Path $Root "upward-plugin-api-1.1.1.pom") (Join-Path $Dest "upward-plugin-api-1.1.1.pom") -Force
Write-Host "Upward Plugin API 1.1.1 installata in $Dest"
