(ns clojure-app.core
  (:gen-class)
  (:require [libpython-clj2.python :as py]))

(require '[clojure.java.shell :as shell])


(require '[libpython-clj2.python
           :refer [as-python as-jvm
                   ->python ->jvm
                   get-attr call-attr call-attr-kw
                   get-item initialize!
                   run-simple-string
                   add-module module-dict
                   import-module
                   python-type
                   dir]
           :as py])


(initialize! ; Python executable
 :python-executable "C:\\Users\\Is-Rael\\anaconda3\\envs\\clojure-python-app-env\\python.exe"
             ; Python Library
 :library-path "C:\\Users\\Is-Rael\\anaconda3\\envs\\clojure-python-app-env\\python38.dll"
             ; Anacondas PATH environment to load native dlls of modules (numpy, etc.)
 :windows-anaconda-activate-bat "C:\\Users\\Is-Rael\\anaconda3\\Scripts\\activate.bat")
; To start new VScode REPL and Jack-In use:
; Ctrl + Alt + C & Ctrl + Alt + J

; Example calling imported python module

(def mpl (py/import-module "mypythonlib-israellandes"))
(py/dir mpl)
(def mpltest (py/import-module "mypythonlib-israellandes.test"))
(py/dir mpltest)
(py/call-attr mpltest "test")

; Main Clojure Script Function
(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (shell/sh "powershell" "python C:\\Users\\Is-Rael\\Desktop\\clojure-python-app\\python-lib\\mypythonlib\\test.py"))

; Example clojure.java.shell in Windows
(shell/sh "notepad.exe")
(shell/sh "C:\\Windows\\SysWOW64\\WindowsPowerShell\\v1.0\\powershell.exe")
(shell/sh "C:\\Windows\\System32\\cmd.exe" "/c")
(shell/sh "powershell" "python C:\\Users\\Is-Rael\\Desktop\\clojure-python-app\\python-lib\\mypythonlib\\test.py")
(shell/sh "sh.exe" "-c" "ls")
(shell/sh "C:\\Program Files\\Git\\git-bash.exe")
(shell/sh "C:\\Program Files\\Git\\git-bash.exe" "-c" "python /c/Users/Is-Rael/Desktop/clojure-python-app/python-lib/mypythonlib/test.py")
(shell/sh "C:\\Users\\Is-Rael\\anaconda3\\envs\\clojure-python-app-env\\python.exe" "C:\\Users\\Is-Rael\\Desktop\\clojure-python-app\\python-lib\\mypythonlib\\test.py")