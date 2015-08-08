package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("xjeffrose"))
  }

  def opinions = Action {
    Ok(views.html.opinions("xjeffrose"))
  }

  def projects = Action {
    Ok(views.html.projects("xjeffrose"))
  }

  def reference = Action {
    Ok(views.html.reference("xjeffrose"))
  }

}
