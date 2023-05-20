@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

public
    fun instanceTypeConfigProperty(initializer: EmrCreateCluster.InstanceTypeConfigProperty.Builder.() -> Unit):
    EmrCreateCluster.InstanceTypeConfigProperty =
    EmrCreateCluster.InstanceTypeConfigProperty.builder().apply(initializer).build()
