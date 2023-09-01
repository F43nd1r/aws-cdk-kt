package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl QueryDefinition.() -> Unit = {},
): QueryDefinition = QueryDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildQueryDefinition(id: String, initializer: @AwsCdkDsl
    QueryDefinition.Builder.() -> Unit = {}): QueryDefinition = QueryDefinition.Builder.create(this,
    id).apply(initializer).build()
