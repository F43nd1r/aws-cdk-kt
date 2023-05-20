@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnFileSystem
import software.amazon.awscdk.services.fsx.CfnFileSystemProps
import software.constructs.Construct

public fun Construct.cfnFileSystem(
  id: String,
  props: CfnFileSystemProps,
  initializer: CfnFileSystem.() -> Unit = {},
): CfnFileSystem = CfnFileSystem(this, id, props).apply(initializer)
