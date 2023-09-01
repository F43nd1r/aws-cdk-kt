package com.faendir.awscdkkt.generated.services.personalize

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSchema
import software.amazon.awscdk.services.personalize.CfnSchemaProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSchema(
  id: String,
  props: CfnSchemaProps,
  initializer: @AwsCdkDsl CfnSchema.() -> Unit = {},
): CfnSchema = CfnSchema(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSchema(id: String, initializer: @AwsCdkDsl CfnSchema.Builder.() -> Unit
    = {}): CfnSchema = CfnSchema.Builder.create(this, id).apply(initializer).build()
