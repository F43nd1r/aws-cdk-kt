package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun instancesConfigProperty(initializer: EmrCreateCluster.InstancesConfigProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.InstancesConfigProperty =
    EmrCreateCluster.InstancesConfigProperty.builder().apply(initializer).build()
