package com.faendir.awscdkkt.services.memorydb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnParameterGroup
import software.amazon.awscdk.services.memorydb.CfnParameterGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnParameterGroup(
  id: String,
  props: CfnParameterGroupProps,
  initializer: CfnParameterGroup.() -> Unit = {},
): CfnParameterGroup = CfnParameterGroup(this, id, props).apply(initializer)
