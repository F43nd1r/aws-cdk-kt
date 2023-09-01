package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnGraphQLSchema.() -> Unit = {},
): CfnGraphQLSchema = CfnGraphQLSchema(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGraphQLSchema(id: String, initializer: @AwsCdkDsl
    CfnGraphQLSchema.Builder.() -> Unit = {}): CfnGraphQLSchema =
    CfnGraphQLSchema.Builder.create(this, id).apply(initializer).build()
