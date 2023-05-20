@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnParameterGroup
import software.amazon.awscdk.services.elasticache.CfnParameterGroupProps
import software.constructs.Construct

public fun Construct.cfnParameterGroup(
  id: String,
  props: CfnParameterGroupProps,
  initializer: CfnParameterGroup.() -> Unit = {},
): CfnParameterGroup = CfnParameterGroup(this, id, props).apply(initializer)
