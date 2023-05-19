@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

public
    fun lustreConfigurationProperty(initializer: CfnFileSystem.LustreConfigurationProperty.Builder.() -> Unit):
    CfnFileSystem.LustreConfigurationProperty =
    CfnFileSystem.LustreConfigurationProperty.builder().apply(initializer).build()
