package CheckEMail

class EMailCheck {

  def nameOfRecipient(email: String): Boolean = {
    var position = 0
    while (email.charAt(position) != '@') {
      if (email.charAt(position) == '.')
        return true

      if (!Character.isLetterOrDigit(email.charAt(position))) throw new IllegalArgumentException("Recipient Name is not alphanumerically correct")
      position = position + 1
    }
    true
  }

  def checkTheSymbol(email: String): Boolean={
    for(i <-0 until email.length)
      if(email.charAt(i) == '@')
        return true
    throw new IllegalArgumentException("Email don't have the @ Symbol")
  }

  def checkDomain(email: String): Boolean={

    if(!checkTheSymbol(email)) return false
    var indexAt = email.indexOf("@") + 1
    while (email.charAt(indexAt) != '.') {
      if (!Character.isLetterOrDigit(email.charAt(indexAt))) throw new IllegalArgumentException("Domain Name is not alphanumeric")
      indexAt = indexAt + 1
    }
    true
  }

  def topLevelDomain(email:String): Boolean={
    if(!checkTheSymbol(email))
      return false
    val indexAt = email.indexOf(".")
    val topLevelDomain = email.substring(indexAt)
    if (topLevelDomain.equals(".com") || topLevelDomain.equals(".net") || topLevelDomain.equals(".org"))
      return true
    throw new IllegalArgumentException("Not Applicable Top Level Domain")
  }
}