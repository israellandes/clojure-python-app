(ns clojure-app.core
  (:gen-class)
  (:require [libpython-clj2.python :as py]))

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

; Example using Normal Python Syntax
; print ("Hey")

; Write in Clojure like:

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (println "Hello, World!")
  (run-simple-string "print('hey')"))


(def tt (py/import-module "mypythonlib"))
(py/from-import "mypythonlib" test)


; (defn call-python-script []

;   (py/py.. test []))

; (call-python-script)

