@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadata
import software.amazon.awscdk.services.glue.CfnSchemaVersionMetadataProps
import software.constructs.Construct

public fun Construct.cfnSchemaVersionMetadata(
  id: String,
  props: CfnSchemaVersionMetadataProps,
  initializer: CfnSchemaVersionMetadata.() -> Unit = {},
): CfnSchemaVersionMetadata = CfnSchemaVersionMetadata(this, id, props).apply(initializer)
