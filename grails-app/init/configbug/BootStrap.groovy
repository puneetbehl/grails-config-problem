package configbug

class BootStrap {

    def grailsApplication

    def init = { servletContext ->
        assert grailsApplication.config.test == null
    }
    def destroy = {
    }
}
