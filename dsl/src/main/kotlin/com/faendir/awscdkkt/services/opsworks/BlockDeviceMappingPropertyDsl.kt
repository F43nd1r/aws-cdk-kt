@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnInstance

public
    fun blockDeviceMappingProperty(initializer: CfnInstance.BlockDeviceMappingProperty.Builder.() -> Unit):
    CfnInstance.BlockDeviceMappingProperty =
    CfnInstance.BlockDeviceMappingProperty.builder().apply(initializer).build()
