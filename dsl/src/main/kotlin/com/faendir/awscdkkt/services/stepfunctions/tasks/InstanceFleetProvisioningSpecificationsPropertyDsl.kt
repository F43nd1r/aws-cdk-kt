package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun instanceFleetProvisioningSpecificationsProperty(initializer: EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty =
    EmrCreateCluster.InstanceFleetProvisioningSpecificationsProperty.builder().apply(initializer).build()
