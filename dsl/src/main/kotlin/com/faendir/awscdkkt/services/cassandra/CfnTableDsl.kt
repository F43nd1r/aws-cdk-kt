@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
