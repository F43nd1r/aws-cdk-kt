@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseProxy
import software.amazon.awscdk.services.rds.DatabaseProxyProps
import software.constructs.Construct

public fun Construct.databaseProxy(
  id: String,
  props: DatabaseProxyProps,
  initializer: DatabaseProxy.() -> Unit = {},
): DatabaseProxy = DatabaseProxy(this, id, props).apply(initializer)
