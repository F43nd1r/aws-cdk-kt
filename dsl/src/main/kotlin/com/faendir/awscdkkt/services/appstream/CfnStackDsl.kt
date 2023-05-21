package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnStack
import software.amazon.awscdk.services.appstream.CfnStackProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStack(id: String, initializer: CfnStack.() -> Unit = {}): CfnStack =
    CfnStack(this, id).apply(initializer)

@Generated
public fun Construct.cfnStack(
  id: String,
  props: CfnStackProps,
  initializer: CfnStack.() -> Unit = {},
): CfnStack = CfnStack(this, id, props).apply(initializer)
