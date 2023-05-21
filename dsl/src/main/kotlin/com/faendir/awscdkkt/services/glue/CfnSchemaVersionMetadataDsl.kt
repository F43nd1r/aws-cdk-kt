package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSchemaVersionMetadata(
  id: String,
  props: CfnSchemaVersionMetadataProps,
  initializer: CfnSchemaVersionMetadata.() -> Unit = {},
): CfnSchemaVersionMetadata = CfnSchemaVersionMetadata(this, id, props).apply(initializer)
