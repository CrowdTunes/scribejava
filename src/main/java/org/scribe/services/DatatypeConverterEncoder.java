package org.scribe.services;

import android.util.Base64;

//import javax.xml.bind.*;

public class DatatypeConverterEncoder extends Base64Encoder
{
  @Override
  public String encode(byte[] bytes)
  {
    return Base64.encodeToString(bytes, Base64.DEFAULT);
    //return DatatypeConverter.printBase64Binary(bytes);
  }

  @Override
  public String getType()
  {
    return "DatatypeConverter";
  }
}
