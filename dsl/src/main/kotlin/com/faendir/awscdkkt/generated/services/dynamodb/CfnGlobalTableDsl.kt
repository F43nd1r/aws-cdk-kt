package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGlobalTable(id: String, props: CfnGlobalTableProps): CfnGlobalTable =
    CfnGlobalTable(this, id, props)

@Generated
public fun Construct.cfnGlobalTable(
  id: String,
  props: CfnGlobalTableProps,
  initializer: @AwsCdkDsl CfnGlobalTable.() -> Unit,
): CfnGlobalTable = CfnGlobalTable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGlobalTable(id: String, initializer: @AwsCdkDsl
    CfnGlobalTable.Builder.() -> Unit): CfnGlobalTable = CfnGlobalTable.Builder.create(this,
    id).apply(initializer).build()
