package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun bootstrapActionConfigProperty(initializer: EmrCreateCluster.BootstrapActionConfigProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.BootstrapActionConfigProperty =
    EmrCreateCluster.BootstrapActionConfigProperty.builder().apply(initializer).build()
