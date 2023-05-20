@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseInstance
import software.amazon.awscdk.services.rds.DatabaseInstanceProps
import software.constructs.Construct

public fun Construct.databaseInstance(
  id: String,
  props: DatabaseInstanceProps,
  initializer: DatabaseInstance.() -> Unit = {},
): DatabaseInstance = DatabaseInstance(this, id, props).apply(initializer)
