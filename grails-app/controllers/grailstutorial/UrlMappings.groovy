package grailstutorial

class UrlMappings {

    static mappings = {
//        "/$controller/$action?/$id?(.$format)?"{
//            constraints {
//                // apply constraints here
//            }
//        }

        "/"(view:"/index")
        "/new"(view:"/newpage") //left-side is URL mapping; right-side is page to be called/rendered
        "/admin/user"(controller: "user", action: "admin")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
