package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun scalingActionProperty(initializer: EmrCreateCluster.ScalingActionProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.ScalingActionProperty =
    EmrCreateCluster.ScalingActionProperty.builder().apply(initializer).build()
