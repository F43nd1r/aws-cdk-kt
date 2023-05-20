@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable
import software.amazon.awscdk.services.cassandra.CfnTableProps
import software.constructs.Construct

public fun Construct.cfnTable(
  id: String,
  props: CfnTableProps,
  initializer: CfnTable.() -> Unit = {},
): CfnTable = CfnTable(this, id, props).apply(initializer)
