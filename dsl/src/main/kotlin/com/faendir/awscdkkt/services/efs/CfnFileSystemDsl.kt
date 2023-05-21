package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnFileSystem
import software.amazon.awscdk.services.efs.CfnFileSystemProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFileSystem(id: String, initializer: CfnFileSystem.() -> Unit = {}):
    CfnFileSystem = CfnFileSystem(this, id).apply(initializer)

@Generated
public fun Construct.cfnFileSystem(
  id: String,
  props: CfnFileSystemProps,
  initializer: CfnFileSystem.() -> Unit = {},
): CfnFileSystem = CfnFileSystem(this, id, props).apply(initializer)
