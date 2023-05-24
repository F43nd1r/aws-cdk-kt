package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnSimpleTable
import software.amazon.awscdk.services.sam.CfnSimpleTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSimpleTable(id: String): CfnSimpleTable = CfnSimpleTable(this, id)

@Generated
public fun Construct.cfnSimpleTable(id: String, initializer: @AwsCdkDsl CfnSimpleTable.() -> Unit):
    CfnSimpleTable = CfnSimpleTable(this, id).apply(initializer)

@Generated
public fun Construct.cfnSimpleTable(id: String, props: CfnSimpleTableProps): CfnSimpleTable =
    CfnSimpleTable(this, id, props)

@Generated
public fun Construct.cfnSimpleTable(
  id: String,
  props: CfnSimpleTableProps,
  initializer: @AwsCdkDsl CfnSimpleTable.() -> Unit,
): CfnSimpleTable = CfnSimpleTable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSimpleTable(id: String, initializer: @AwsCdkDsl
    CfnSimpleTable.Builder.() -> Unit): CfnSimpleTable = CfnSimpleTable.Builder.create(this,
    id).apply(initializer).build()
