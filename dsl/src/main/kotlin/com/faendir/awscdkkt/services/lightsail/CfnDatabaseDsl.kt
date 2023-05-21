package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDatabase
import software.amazon.awscdk.services.lightsail.CfnDatabaseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDatabase(
  id: String,
  props: CfnDatabaseProps,
  initializer: CfnDatabase.() -> Unit = {},
): CfnDatabase = CfnDatabase(this, id, props).apply(initializer)
