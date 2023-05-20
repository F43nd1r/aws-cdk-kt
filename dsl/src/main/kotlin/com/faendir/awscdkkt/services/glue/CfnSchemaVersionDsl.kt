@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSchemaVersion
import software.amazon.awscdk.services.glue.CfnSchemaVersionProps
import software.constructs.Construct

public fun Construct.cfnSchemaVersion(
  id: String,
  props: CfnSchemaVersionProps,
  initializer: CfnSchemaVersion.() -> Unit = {},
): CfnSchemaVersion = CfnSchemaVersion(this, id, props).apply(initializer)
