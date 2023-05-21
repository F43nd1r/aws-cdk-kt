package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

@Generated
public fun dimensionProperty(initializer: CfnAnomalyDetector.DimensionProperty.Builder.() -> Unit =
    {}): CfnAnomalyDetector.DimensionProperty =
    CfnAnomalyDetector.DimensionProperty.builder().apply(initializer).build()
