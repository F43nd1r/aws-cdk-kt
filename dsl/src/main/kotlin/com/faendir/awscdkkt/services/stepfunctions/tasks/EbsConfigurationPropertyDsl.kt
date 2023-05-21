package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@Generated
public
    fun ebsConfigurationProperty(initializer: EmrCreateCluster.EbsConfigurationProperty.Builder.() -> Unit
    = {}): EmrCreateCluster.EbsConfigurationProperty =
    EmrCreateCluster.EbsConfigurationProperty.builder().apply(initializer).build()
