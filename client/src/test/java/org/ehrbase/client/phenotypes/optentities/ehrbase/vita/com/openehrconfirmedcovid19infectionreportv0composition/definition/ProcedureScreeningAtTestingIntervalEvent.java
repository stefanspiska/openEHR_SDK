package org.ehrbase.client.phenotypes.optentities.ehrbase.vita.com.openehrconfirmedcovid19infectionreportv0composition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import ehrbase.vita.com.shareddefinition.MathFunctionDefiningcode;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;

@Entity
@OptionFor("INTERVAL_EVENT")
public class ProcedureScreeningAtTestingIntervalEvent implements ProcedureScreeningAtTestingChoice {
  @Path("/time|value")
  private TemporalAccessor timeValue;

  @Path("/data[at0003]/items[at0034]/value|defining_code")
  private ScreeningPurposeDefiningcode screeningPurposeDefiningcode;

  @Path("/data[at0003]/items[at0026]")
  private List<Cluster> additionalDetails;

  @Path("/math_function|defining_code")
  private MathFunctionDefiningcode mathFunctionDefiningcode;

  @Path("/data[at0003]/items[at0022]")
  private List<PostTestProcedureScreeningSpecificProcedureCluster> specificProcedure;

  @Path("/width|value")
  private TemporalAmount widthValue;

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setScreeningPurposeDefiningcode(
      ScreeningPurposeDefiningcode screeningPurposeDefiningcode) {
     this.screeningPurposeDefiningcode = screeningPurposeDefiningcode;
  }

  public ScreeningPurposeDefiningcode getScreeningPurposeDefiningcode() {
     return this.screeningPurposeDefiningcode ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }

  public void setMathFunctionDefiningcode(MathFunctionDefiningcode mathFunctionDefiningcode) {
     this.mathFunctionDefiningcode = mathFunctionDefiningcode;
  }

  public MathFunctionDefiningcode getMathFunctionDefiningcode() {
     return this.mathFunctionDefiningcode ;
  }

  public void setSpecificProcedure(
      List<PostTestProcedureScreeningSpecificProcedureCluster> specificProcedure) {
     this.specificProcedure = specificProcedure;
  }

  public List<PostTestProcedureScreeningSpecificProcedureCluster> getSpecificProcedure() {
     return this.specificProcedure ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }
}
