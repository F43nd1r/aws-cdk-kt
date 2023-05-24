package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSchema
import software.amazon.awscdk.services.glue.CfnSchemaProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSchema(id: String, props: CfnSchemaProps): CfnSchema = CfnSchema(this, id,
    props)

@Generated
public fun Construct.cfnSchema(
  id: String,
  props: CfnSchemaProps,
  initializer: @AwsCdkDsl CfnSchema.() -> Unit,
): CfnSchema = CfnSchema(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSchema(id: String, initializer: @AwsCdkDsl
    CfnSchema.Builder.() -> Unit): CfnSchema = CfnSchema.Builder.create(this,
    id).apply(initializer).build()
