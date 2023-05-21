package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.LustreFileSystemProps

@Generated
public fun lustreFileSystemProps(initializer: LustreFileSystemProps.Builder.() -> Unit = {}):
    LustreFileSystemProps = LustreFileSystemProps.builder().apply(initializer).build()
