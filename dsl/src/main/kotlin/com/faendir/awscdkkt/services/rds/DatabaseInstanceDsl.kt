@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
