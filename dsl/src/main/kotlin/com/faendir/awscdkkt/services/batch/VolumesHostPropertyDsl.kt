@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

public
    fun volumesHostProperty(initializer: CfnJobDefinition.VolumesHostProperty.Builder.() -> Unit):
    CfnJobDefinition.VolumesHostProperty =
    CfnJobDefinition.VolumesHostProperty.builder().apply(initializer).build()
