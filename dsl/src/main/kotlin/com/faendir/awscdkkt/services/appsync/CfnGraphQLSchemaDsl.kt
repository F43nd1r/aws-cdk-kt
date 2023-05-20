@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnGraphQLSchema
import software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps
import software.constructs.Construct

public fun Construct.cfnGraphQLSchema(
  id: String,
  props: CfnGraphQLSchemaProps,
  initializer: CfnGraphQLSchema.() -> Unit = {},
): CfnGraphQLSchema = CfnGraphQLSchema(this, id, props).apply(initializer)
