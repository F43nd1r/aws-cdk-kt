package com.faendir.awscdkkt.services.dynamodb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGlobalTable(
  id: String,
  props: CfnGlobalTableProps,
  initializer: CfnGlobalTable.() -> Unit = {},
): CfnGlobalTable = CfnGlobalTable(this, id, props).apply(initializer)
