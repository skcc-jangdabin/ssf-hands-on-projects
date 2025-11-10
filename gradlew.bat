@echo off
@rem SPDX-License-Identifier: Apache-2.0
@rem Licensed under the Apache License, Version 2.0
@rem Copyright 2016 the original author or authors.

cd /d "%~dp0"
if "%EXECUTABLE%"=="" set EXECUTABLE=java.exe
"%EXECUTABLE%" -jar gradle\wrapper\gradle-wrapper.jar %*
