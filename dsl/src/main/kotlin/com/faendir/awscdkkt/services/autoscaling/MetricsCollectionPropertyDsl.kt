package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@Generated
public
    fun metricsCollectionProperty(initializer: CfnAutoScalingGroup.MetricsCollectionProperty.Builder.() -> Unit
    = {}): CfnAutoScalingGroup.MetricsCollectionProperty =
    CfnAutoScalingGroup.MetricsCollectionProperty.builder().apply(initializer).build()
