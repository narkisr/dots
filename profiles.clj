{
  :user {
    :plugins [
       [mvxcvi/whidbey "2.2.0"]
       [io.aviso/pretty "0.1.37"]
       [cider/cider-nrepl "0.22.4"]]

    :middleware [
        cider-nrepl.plugin/middleware
        io.aviso.lein-pretty/inject
        whidbey.plugin/repl-pprint]

    :source-paths  ["dev" "test"]

    :dependencies [[io.aviso/pretty "0.1.37"]]

    :whidbey {
      :witdh 180
      :map-delimiter ""
      :color-scheme {
         :delimiter [:red]
         :tag       [:red]
         :nil       [:cyan]
         :boolean   [:cyan]
         :number    [:cyan]
         :string    [:cyan]
         :character [:cyan]
         :keyword   [:green]
         :symbol    nil
         :function-symbol [:blue]
         :class-delimiter [:blue]
         :class-name nil
         :exception [:red]
      }
    }
  }
}






