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
public class StoryHistoryAnyEventIntervalEvent implements StoryHistoryAnyEventChoice {
  @Path("/time|value")
  private TemporalAccessor timeValue;

  @Path("/data[at0003]/items[at0004]")
  private List<StoryHistoryStoryElement> story;

  @Path("/math_function|defining_code")
  private MathFunctionDefiningcode mathFunctionDefiningcode;

  @Path("/width|value")
  private TemporalAmount widthValue;

  @Path("/data[at0003]/items[at0006]")
  private List<Cluster> structuredDetail;

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setStory(List<StoryHistoryStoryElement> story) {
     this.story = story;
  }

  public List<StoryHistoryStoryElement> getStory() {
     return this.story ;
  }

  public void setMathFunctionDefiningcode(MathFunctionDefiningcode mathFunctionDefiningcode) {
     this.mathFunctionDefiningcode = mathFunctionDefiningcode;
  }

  public MathFunctionDefiningcode getMathFunctionDefiningcode() {
     return this.mathFunctionDefiningcode ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setStructuredDetail(List<Cluster> structuredDetail) {
     this.structuredDetail = structuredDetail;
  }

  public List<Cluster> getStructuredDetail() {
     return this.structuredDetail ;
  }
}
