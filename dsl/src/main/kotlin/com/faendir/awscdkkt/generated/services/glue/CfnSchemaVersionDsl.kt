package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSchemaVersion
import software.amazon.awscdk.services.glue.CfnSchemaVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSchemaVersion(
  id: String,
  props: CfnSchemaVersionProps,
  initializer: @AwsCdkDsl CfnSchemaVersion.() -> Unit = {},
): CfnSchemaVersion = CfnSchemaVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSchemaVersion(id: String, initializer: @AwsCdkDsl CfnSchemaVersion.Builder.() -> Unit = {}): CfnSchemaVersion = CfnSchemaVersion.Builder.create(this, id).apply(initializer).build()
