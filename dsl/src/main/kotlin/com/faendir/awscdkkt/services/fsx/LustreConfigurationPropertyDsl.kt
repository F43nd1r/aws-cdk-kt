@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

public
    fun lustreConfigurationProperty(initializer: CfnFileSystem.LustreConfigurationProperty.Builder.() -> Unit):
    CfnFileSystem.LustreConfigurationProperty =
    CfnFileSystem.LustreConfigurationProperty.builder().apply(initializer).build()
