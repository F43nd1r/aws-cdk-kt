package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem
import software.amazon.awscdk.services.fsx.CfnFileSystemProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFileSystem(
  id: String,
  props: CfnFileSystemProps,
  initializer: CfnFileSystem.() -> Unit = {},
): CfnFileSystem = CfnFileSystem(this, id, props).apply(initializer)
