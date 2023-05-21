package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLSchema
import software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGraphQLSchema(
  id: String,
  props: CfnGraphQLSchemaProps,
  initializer: CfnGraphQLSchema.() -> Unit = {},
): CfnGraphQLSchema = CfnGraphQLSchema(this, id, props).apply(initializer)
