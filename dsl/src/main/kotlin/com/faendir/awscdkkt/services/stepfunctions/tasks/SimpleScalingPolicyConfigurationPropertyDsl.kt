package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun simpleScalingPolicyConfigurationProperty(initializer: EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.SimpleScalingPolicyConfigurationProperty =
    EmrCreateCluster.SimpleScalingPolicyConfigurationProperty.builder().apply(initializer).build()
