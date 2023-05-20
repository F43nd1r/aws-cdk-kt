@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.LustreFileSystem
import software.amazon.awscdk.services.fsx.LustreFileSystemProps
import software.constructs.Construct

public fun Construct.lustreFileSystem(
  id: String,
  props: LustreFileSystemProps,
  initializer: LustreFileSystem.() -> Unit = {},
): LustreFileSystem = LustreFileSystem(this, id, props).apply(initializer)
