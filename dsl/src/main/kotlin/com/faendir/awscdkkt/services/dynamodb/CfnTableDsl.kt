package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnTable
import software.amazon.awscdk.services.dynamodb.CfnTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTable(
  id: String,
  props: CfnTableProps,
  initializer: CfnTable.() -> Unit = {},
): CfnTable = CfnTable(this, id, props).apply(initializer)
