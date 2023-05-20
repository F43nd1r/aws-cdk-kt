@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

public
    fun diskIopsConfigurationProperty(initializer: CfnFileSystem.DiskIopsConfigurationProperty.Builder.() -> Unit):
    CfnFileSystem.DiskIopsConfigurationProperty =
    CfnFileSystem.DiskIopsConfigurationProperty.builder().apply(initializer).build()
