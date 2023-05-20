@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

public
    fun windowsConfigurationProperty(initializer: CfnFileSystem.WindowsConfigurationProperty.Builder.() -> Unit):
    CfnFileSystem.WindowsConfigurationProperty =
    CfnFileSystem.WindowsConfigurationProperty.builder().apply(initializer).build()
