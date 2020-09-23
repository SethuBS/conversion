class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		//"/"(view:"/index")
		"/"(controller:"calculation", action:"/index")
		"500"(view:'/error')
	}
}
