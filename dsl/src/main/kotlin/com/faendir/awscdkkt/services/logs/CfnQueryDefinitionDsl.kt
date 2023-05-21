package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnQueryDefinition
import software.amazon.awscdk.services.logs.CfnQueryDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQueryDefinition(
  id: String,
  props: CfnQueryDefinitionProps,
  initializer: CfnQueryDefinition.() -> Unit = {},
): CfnQueryDefinition = CfnQueryDefinition(this, id, props).apply(initializer)
