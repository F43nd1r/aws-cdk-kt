package com.faendir.awscdkkt.services.timestream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnDatabase
import software.amazon.awscdk.services.timestream.CfnDatabaseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDatabase(id: String, initializer: CfnDatabase.() -> Unit = {}): CfnDatabase
    = CfnDatabase(this, id).apply(initializer)

@Generated
public fun Construct.cfnDatabase(
  id: String,
  props: CfnDatabaseProps,
  initializer: CfnDatabase.() -> Unit = {},
): CfnDatabase = CfnDatabase(this, id, props).apply(initializer)
