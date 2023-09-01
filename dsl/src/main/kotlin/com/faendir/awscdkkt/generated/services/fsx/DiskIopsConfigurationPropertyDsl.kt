package com.faendir.awscdkkt.generated.services.fsx

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem

@Generated
public fun buildDiskIopsConfigurationProperty(initializer: @AwsCdkDsl
    CfnFileSystem.DiskIopsConfigurationProperty.Builder.() -> Unit = {}):
    CfnFileSystem.DiskIopsConfigurationProperty =
    CfnFileSystem.DiskIopsConfigurationProperty.Builder().apply(initializer).build()
