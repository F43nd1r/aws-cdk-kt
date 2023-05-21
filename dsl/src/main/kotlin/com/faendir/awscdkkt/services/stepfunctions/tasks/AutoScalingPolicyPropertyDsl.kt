package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun autoScalingPolicyProperty(initializer: EmrCreateCluster.AutoScalingPolicyProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.AutoScalingPolicyProperty =
    EmrCreateCluster.AutoScalingPolicyProperty.builder().apply(initializer).build()
