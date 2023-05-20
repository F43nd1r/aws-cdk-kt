@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps
import software.constructs.Construct

public fun Construct.cfnAnomalyDetector(
  id: String,
  props: CfnAnomalyDetectorProps,
  initializer: CfnAnomalyDetector.() -> Unit = {},
): CfnAnomalyDetector = CfnAnomalyDetector(this, id, props).apply(initializer)
