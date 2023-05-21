package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition
import software.amazon.awscdk.services.batch.CfnJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnJobDefinition(
  id: String,
  props: CfnJobDefinitionProps,
  initializer: CfnJobDefinition.() -> Unit = {},
): CfnJobDefinition = CfnJobDefinition(this, id, props).apply(initializer)
