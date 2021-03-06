package com.redhat.gss.example.camel.aggregation;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

//simply combines Exchange String body values using '+' as a delimiter
public class MyAggregationStrategy implements AggregationStrategy {

  public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
      if (oldExchange == null) {
          return newExchange;
      }

      String oldBody = oldExchange.getIn().getBody(String.class);
      String newBody = newExchange.getIn().getBody(String.class);
      oldExchange.getIn().setBody(oldBody + newBody);
      return oldExchange;
  }
}
