package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun applicationConfigProperty(initializer: EmrCreateCluster.ApplicationConfigProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.ApplicationConfigProperty =
    EmrCreateCluster.ApplicationConfigProperty.builder().apply(initializer).build()
