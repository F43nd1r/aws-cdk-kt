@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

public
    fun instanceGroupConfigProperty(initializer: EmrCreateCluster.InstanceGroupConfigProperty.Builder.() -> Unit):
    EmrCreateCluster.InstanceGroupConfigProperty =
    EmrCreateCluster.InstanceGroupConfigProperty.builder().apply(initializer).build()
