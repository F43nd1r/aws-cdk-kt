package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun placementTypeProperty(initializer: EmrCreateCluster.PlacementTypeProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.PlacementTypeProperty =
    EmrCreateCluster.PlacementTypeProperty.builder().apply(initializer).build()
