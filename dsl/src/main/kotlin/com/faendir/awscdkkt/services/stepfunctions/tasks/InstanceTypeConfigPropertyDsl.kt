package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun instanceTypeConfigProperty(initializer: EmrCreateCluster.InstanceTypeConfigProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.InstanceTypeConfigProperty =
    EmrCreateCluster.InstanceTypeConfigProperty.builder().apply(initializer).build()
