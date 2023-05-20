@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps
import software.constructs.Construct

public fun Construct.cfnAnomalyDetector(
  id: String,
  props: CfnAnomalyDetectorProps,
  initializer: CfnAnomalyDetector.() -> Unit = {},
): CfnAnomalyDetector = CfnAnomalyDetector(this, id, props).apply(initializer)

public fun Construct.cfnAnomalyDetector(id: String, initializer: CfnAnomalyDetector.() -> Unit =
    {}): CfnAnomalyDetector = CfnAnomalyDetector(this, id).apply(initializer)
