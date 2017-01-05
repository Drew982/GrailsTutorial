package grailstutorial

class UrlMappings {

    static mappings = {
//        "/$controller/$action?/$id?(.$format)?"{
//            constraints {
//                // apply constraints here
//            }
//        }

        "/"(view:"/index")
        "/new"(view:"user/newpage") //left-side is URL mapping; right-side is page to be called/rendered

        "/login"(view: "login/login")

        "/user/admin"(controller: "user", action: "admin")
        "/user/admin/create"(view:"user/createform")
        "/user/admin/update"(view:"user/updateform")
        "/user/create"(controller: "user", action: "create")
        "/user/update"(controller: "user", action: "update")
        "/user/delete"(controller: "user", action: "delete")

        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
