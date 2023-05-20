@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

public
    fun autoScalingPolicyProperty(initializer: EmrCreateCluster.AutoScalingPolicyProperty.Builder.() -> Unit):
    EmrCreateCluster.AutoScalingPolicyProperty =
    EmrCreateCluster.AutoScalingPolicyProperty.builder().apply(initializer).build()
