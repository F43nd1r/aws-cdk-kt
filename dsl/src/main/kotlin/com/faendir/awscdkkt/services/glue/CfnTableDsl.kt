@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTable
import software.amazon.awscdk.services.glue.CfnTableProps
import software.constructs.Construct

public fun Construct.cfnTable(
  id: String,
  props: CfnTableProps,
  initializer: CfnTable.() -> Unit = {},
): CfnTable = CfnTable(this, id, props).apply(initializer)
