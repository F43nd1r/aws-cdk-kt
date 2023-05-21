package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public fun scalingRuleProperty(initializer: EmrCreateCluster.ScalingRuleProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.ScalingRuleProperty =
    EmrCreateCluster.ScalingRuleProperty.builder().apply(initializer).build()
