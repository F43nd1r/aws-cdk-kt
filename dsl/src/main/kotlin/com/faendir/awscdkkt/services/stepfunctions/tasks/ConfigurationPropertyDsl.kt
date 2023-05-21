package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun configurationProperty(initializer: EmrCreateCluster.ConfigurationProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.ConfigurationProperty =
    EmrCreateCluster.ConfigurationProperty.builder().apply(initializer).build()
