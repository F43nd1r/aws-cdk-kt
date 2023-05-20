@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnQueryDefinition
import software.amazon.awscdk.services.logs.CfnQueryDefinitionProps
import software.constructs.Construct

public fun Construct.cfnQueryDefinition(
  id: String,
  props: CfnQueryDefinitionProps,
  initializer: CfnQueryDefinition.() -> Unit = {},
): CfnQueryDefinition = CfnQueryDefinition(this, id, props).apply(initializer)
