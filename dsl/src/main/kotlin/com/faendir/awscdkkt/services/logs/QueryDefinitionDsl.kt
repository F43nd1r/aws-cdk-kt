@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.QueryDefinition
import software.amazon.awscdk.services.logs.QueryDefinitionProps
import software.constructs.Construct

public fun Construct.queryDefinition(
  id: String,
  props: QueryDefinitionProps,
  initializer: QueryDefinition.() -> Unit = {},
): QueryDefinition = QueryDefinition(this, id, props).apply(initializer)
