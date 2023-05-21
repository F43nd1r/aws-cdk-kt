package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnGroup
import software.amazon.awscdk.services.iam.CfnGroupProps
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
