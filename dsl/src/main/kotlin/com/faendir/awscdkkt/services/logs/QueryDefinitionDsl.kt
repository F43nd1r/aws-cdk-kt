package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.QueryDefinition
import software.amazon.awscdk.services.logs.QueryDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.queryDefinition(
  id: String,
  props: QueryDefinitionProps,
  initializer: QueryDefinition.() -> Unit = {},
): QueryDefinition = QueryDefinition(this, id, props).apply(initializer)
