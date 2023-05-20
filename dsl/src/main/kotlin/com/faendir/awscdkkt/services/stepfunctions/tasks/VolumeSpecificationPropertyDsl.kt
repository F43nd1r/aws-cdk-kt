@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

public
    fun volumeSpecificationProperty(initializer: EmrCreateCluster.VolumeSpecificationProperty.Builder.() -> Unit):
    EmrCreateCluster.VolumeSpecificationProperty =
    EmrCreateCluster.VolumeSpecificationProperty.builder().apply(initializer).build()
