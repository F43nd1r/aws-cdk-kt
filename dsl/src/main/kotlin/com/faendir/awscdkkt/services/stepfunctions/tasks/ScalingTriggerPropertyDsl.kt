@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

public
    fun scalingTriggerProperty(initializer: EmrCreateCluster.ScalingTriggerProperty.Builder.() -> Unit):
    EmrCreateCluster.ScalingTriggerProperty =
    EmrCreateCluster.ScalingTriggerProperty.builder().apply(initializer).build()
