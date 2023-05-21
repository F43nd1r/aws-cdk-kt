package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun instanceGroupConfigProperty(initializer: EmrCreateCluster.InstanceGroupConfigProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.InstanceGroupConfigProperty =
    EmrCreateCluster.InstanceGroupConfigProperty.builder().apply(initializer).build()
