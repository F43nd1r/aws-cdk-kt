package com.faendir.awscdkkt.services.dax

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnParameterGroup
import software.amazon.awscdk.services.dax.CfnParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnParameterGroup(id: String, initializer: CfnParameterGroup.() -> Unit = {}):
    CfnParameterGroup = CfnParameterGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnParameterGroup(
  id: String,
  props: CfnParameterGroupProps,
  initializer: CfnParameterGroup.() -> Unit = {},
): CfnParameterGroup = CfnParameterGroup(this, id, props).apply(initializer)
