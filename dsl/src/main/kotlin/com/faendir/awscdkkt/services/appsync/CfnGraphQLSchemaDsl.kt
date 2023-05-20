@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
