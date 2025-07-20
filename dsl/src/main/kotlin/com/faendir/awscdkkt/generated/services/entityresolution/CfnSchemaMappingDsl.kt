package com.faendir.awscdkkt.generated.services.entityresolution

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.entityresolution.CfnSchemaMapping
import software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSchemaMapping(
  id: String,
  props: CfnSchemaMappingProps,
  initializer: @AwsCdkDsl CfnSchemaMapping.() -> Unit = {},
): CfnSchemaMapping = CfnSchemaMapping(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSchemaMapping(id: String, initializer: @AwsCdkDsl CfnSchemaMapping.Builder.() -> Unit = {}): CfnSchemaMapping = CfnSchemaMapping.Builder.create(this, id).apply(initializer).build()
