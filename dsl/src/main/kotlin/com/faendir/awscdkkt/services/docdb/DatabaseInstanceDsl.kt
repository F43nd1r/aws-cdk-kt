@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.docdb.DatabaseInstance
import software.amazon.awscdk.services.docdb.DatabaseInstanceProps
import software.constructs.Construct

public fun Construct.databaseInstance(
  id: String,
  props: DatabaseInstanceProps,
  initializer: DatabaseInstance.() -> Unit = {},
): DatabaseInstance = DatabaseInstance(this, id, props).apply(initializer)
