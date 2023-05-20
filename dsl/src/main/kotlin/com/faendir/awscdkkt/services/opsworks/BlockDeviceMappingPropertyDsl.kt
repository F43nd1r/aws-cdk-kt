@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnInstance

public
    fun blockDeviceMappingProperty(initializer: CfnInstance.BlockDeviceMappingProperty.Builder.() -> Unit):
    CfnInstance.BlockDeviceMappingProperty =
    CfnInstance.BlockDeviceMappingProperty.builder().apply(initializer).build()
