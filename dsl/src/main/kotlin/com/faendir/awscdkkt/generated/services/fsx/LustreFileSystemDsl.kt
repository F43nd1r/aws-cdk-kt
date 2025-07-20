package com.faendir.awscdkkt.generated.services.fsx

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.LustreFileSystem
import software.amazon.awscdk.services.fsx.LustreFileSystemProps
import software.constructs.Construct

@Generated
public fun Construct.lustreFileSystem(
  id: String,
  props: LustreFileSystemProps,
  initializer: @AwsCdkDsl LustreFileSystem.() -> Unit = {},
): LustreFileSystem = LustreFileSystem(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLustreFileSystem(id: String, initializer: @AwsCdkDsl LustreFileSystem.Builder.() -> Unit = {}): LustreFileSystem = LustreFileSystem.Builder.create(this, id).apply(initializer).build()
