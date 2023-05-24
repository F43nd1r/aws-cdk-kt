package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSchemaVersionMetadata(id: String, props: CfnSchemaVersionMetadataProps):
    CfnSchemaVersionMetadata = CfnSchemaVersionMetadata(this, id, props)

@Generated
public fun Construct.cfnSchemaVersionMetadata(
  id: String,
  props: CfnSchemaVersionMetadataProps,
  initializer: @AwsCdkDsl CfnSchemaVersionMetadata.() -> Unit,
): CfnSchemaVersionMetadata = CfnSchemaVersionMetadata(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSchemaVersionMetadata(id: String, initializer: @AwsCdkDsl
    CfnSchemaVersionMetadata.Builder.() -> Unit): CfnSchemaVersionMetadata =
    CfnSchemaVersionMetadata.Builder.create(this, id).apply(initializer).build()
