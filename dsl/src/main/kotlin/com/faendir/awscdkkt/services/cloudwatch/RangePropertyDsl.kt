package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@Generated
public fun rangeProperty(initializer: CfnAnomalyDetector.RangeProperty.Builder.() -> Unit = {}):
    CfnAnomalyDetector.RangeProperty =
    CfnAnomalyDetector.RangeProperty.builder().apply(initializer).build()
