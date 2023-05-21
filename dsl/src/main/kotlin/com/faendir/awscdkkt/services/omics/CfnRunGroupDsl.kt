package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnRunGroup
import software.amazon.awscdk.services.omics.CfnRunGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRunGroup(id: String, initializer: CfnRunGroup.() -> Unit = {}): CfnRunGroup
    = CfnRunGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnRunGroup(
  id: String,
  props: CfnRunGroupProps,
  initializer: CfnRunGroup.() -> Unit = {},
): CfnRunGroup = CfnRunGroup(this, id, props).apply(initializer)
