@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

public
    fun instanceTypeConfigProperty(initializer: EmrCreateCluster.InstanceTypeConfigProperty.Builder.() -> Unit):
    EmrCreateCluster.InstanceTypeConfigProperty =
    EmrCreateCluster.InstanceTypeConfigProperty.builder().apply(initializer).build()
