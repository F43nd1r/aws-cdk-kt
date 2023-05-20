@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

public
    fun configurationProperty(initializer: EmrCreateCluster.ConfigurationProperty.Builder.() -> Unit):
    EmrCreateCluster.ConfigurationProperty =
    EmrCreateCluster.ConfigurationProperty.builder().apply(initializer).build()
