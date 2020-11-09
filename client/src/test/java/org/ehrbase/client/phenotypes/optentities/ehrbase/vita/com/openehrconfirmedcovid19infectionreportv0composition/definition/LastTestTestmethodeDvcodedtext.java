package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datatypes.CodePhrase;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("DV_CODED_TEXT")
public class LastTestTestmethodeDvcodedtext implements LastTestTestmethodeChoice {
  @Path("|defining_code")
  private CodePhrase testmethodeDefiningcode;

  public void setTestmethodeDefiningcode(CodePhrase testmethodeDefiningcode) {
     this.testmethodeDefiningcode = testmethodeDefiningcode;
  }

  public CodePhrase getTestmethodeDefiningcode() {
     return this.testmethodeDefiningcode ;
  }
}
