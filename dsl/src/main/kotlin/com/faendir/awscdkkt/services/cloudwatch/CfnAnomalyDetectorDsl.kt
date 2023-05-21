package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnomalyDetector(id: String, initializer: CfnAnomalyDetector.() -> Unit =
    {}): CfnAnomalyDetector = CfnAnomalyDetector(this, id).apply(initializer)

@Generated
public fun Construct.cfnAnomalyDetector(
  id: String,
  props: CfnAnomalyDetectorProps,
  initializer: CfnAnomalyDetector.() -> Unit = {},
): CfnAnomalyDetector = CfnAnomalyDetector(this, id, props).apply(initializer)
