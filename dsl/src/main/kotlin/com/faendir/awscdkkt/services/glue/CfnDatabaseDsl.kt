@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDatabase
import software.amazon.awscdk.services.glue.CfnDatabaseProps
import software.constructs.Construct

public fun Construct.cfnDatabase(
  id: String,
  props: CfnDatabaseProps,
  initializer: CfnDatabase.() -> Unit = {},
): CfnDatabase = CfnDatabase(this, id, props).apply(initializer)
