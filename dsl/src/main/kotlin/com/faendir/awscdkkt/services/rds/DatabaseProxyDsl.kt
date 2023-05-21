package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseProxy
import software.amazon.awscdk.services.rds.DatabaseProxyProps
import software.constructs.Construct

@Generated
public fun Construct.databaseProxy(
  id: String,
  props: DatabaseProxyProps,
  initializer: DatabaseProxy.() -> Unit = {},
): DatabaseProxy = DatabaseProxy(this, id, props).apply(initializer)
