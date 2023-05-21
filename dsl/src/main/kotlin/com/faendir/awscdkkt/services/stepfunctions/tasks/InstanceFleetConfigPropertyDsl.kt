package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun instanceFleetConfigProperty(initializer: EmrCreateCluster.InstanceFleetConfigProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.InstanceFleetConfigProperty =
    EmrCreateCluster.InstanceFleetConfigProperty.builder().apply(initializer).build()
