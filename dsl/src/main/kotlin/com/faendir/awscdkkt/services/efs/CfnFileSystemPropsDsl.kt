package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnFileSystemProps

@Generated
public fun cfnFileSystemProps(initializer: CfnFileSystemProps.Builder.() -> Unit = {}):
    CfnFileSystemProps = CfnFileSystemProps.builder().apply(initializer).build()
