package com.faendir.awscdkkt.services.xray

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.xray.CfnGroup
import software.amazon.awscdk.services.xray.CfnGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGroup(id: String, initializer: CfnGroup.() -> Unit = {}): CfnGroup =
    CfnGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnGroup(
  id: String,
  props: CfnGroupProps,
  initializer: CfnGroup.() -> Unit = {},
): CfnGroup = CfnGroup(this, id, props).apply(initializer)
