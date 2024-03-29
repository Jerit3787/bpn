# bpn
![GitHub Release Date](https://img.shields.io/github/release-date/Jerit3787/bpn) ![GitHub last commit](https://img.shields.io/github/last-commit/Jerit3787/bpn) ![GitHub branch checks state](https://img.shields.io/github/checks-status/Jerit3787/bpn/master) ![GitHub issues](https://img.shields.io/github/issues/Jerit3787/bpn) ![GitHub deployments](https://img.shields.io/github/deployments/Jerit3787/bpn/github-pages) ![GitHub all releases](https://img.shields.io/github/downloads/Jerit3787/bpn/total) ![GitHub](https://img.shields.io/github/license/Jerit3787/bpn)

Simple tool to check requirement for Bantuan Prihatin Nasional (BPN). **Built with Swing Java**

## Requirements
- (v1.2+) Requires Java Runtime Enviroment (JRE) 8. [Download Here (Oracle)](https://www.java.com/en/download/manual.jsp)

## Releases
- ~~SSBPN CLI (Command-Line Interface)~~ (Deprecated since v1.1)
- SSBPN GUI (Graphical User Interface)

## Video
Watch my fast editing video on this project!
- View [Fast Edit Video](https://youtu.be/VqE4YVPQw_Q).

## Future Plans
- [X] Add Author Pane.
- [ ] Make support for `*.exe` file type
- [X] Build support for `JRE 8` / include JDK 14 library in executable file (*.exe*).
- [X] Implement `material UI API` to modernize *Swing's default UI*.

## Build source locally
### Requirements
- Maven installed
- Java Development Kit (JDK) 8 installed `I used Java SE JDK 8 from Oracle`
- A text editor / command-line `I used VS Code with Java Extensions Pack`

### Steps `in VS Code`
- Click on Maven tabs
- Under lifecycle, click on `package`
- Wait until it is finished and jar will be available in `/target` folder.
- Run `<java> -jar <filename>-with-dependencies.jar`

### Steps `in command-line`
- Run `mvm package -f "<directory>/pom.xml`
- Wait until it is finished and jar will be available in `/target` folder.
- Run `<java> -jar <filename>-with-dependencies.jar`

### Steps `using npm`
- Run `cd bpn`
- Run `npm run build`
- Wait until it is finished and jar will be available in `/target` folder.
- Run `<java> -jar <filename>-with-dependencies.jar`

## Run website locally
### Requirements :
- Linux installed `perfer Ubuntu`
- Node installed

### Steps
- Run `npm install` to install dependencies
- Run `npm start` to start the local web server
- Open `127.0.0.1:4000` to view the website
