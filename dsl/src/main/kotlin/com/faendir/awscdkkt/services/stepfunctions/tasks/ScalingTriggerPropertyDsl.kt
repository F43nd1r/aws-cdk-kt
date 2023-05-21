package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun scalingTriggerProperty(initializer: EmrCreateCluster.ScalingTriggerProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.ScalingTriggerProperty =
    EmrCreateCluster.ScalingTriggerProperty.builder().apply(initializer).build()
