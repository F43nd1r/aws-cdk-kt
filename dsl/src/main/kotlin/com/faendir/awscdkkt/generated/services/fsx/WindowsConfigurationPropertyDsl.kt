package com.faendir.awscdkkt.generated.services.fsx

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

@Generated
public fun buildWindowsConfigurationProperty(initializer: @AwsCdkDsl
    CfnFileSystem.WindowsConfigurationProperty.Builder.() -> Unit = {}):
    CfnFileSystem.WindowsConfigurationProperty =
    CfnFileSystem.WindowsConfigurationProperty.Builder().apply(initializer).build()
