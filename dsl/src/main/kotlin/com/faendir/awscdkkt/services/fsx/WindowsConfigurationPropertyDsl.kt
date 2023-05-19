@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

public
    fun windowsConfigurationProperty(initializer: CfnFileSystem.WindowsConfigurationProperty.Builder.() -> Unit):
    CfnFileSystem.WindowsConfigurationProperty =
    CfnFileSystem.WindowsConfigurationProperty.builder().apply(initializer).build()
