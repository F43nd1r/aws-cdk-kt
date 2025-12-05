package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnDataTable
import software.amazon.awscdk.services.connect.CfnDataTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataTable(id: String, initializer: @AwsCdkDsl CfnDataTable.() -> Unit = {}): CfnDataTable = CfnDataTable(this, id).apply(initializer)

@Generated
public fun Construct.cfnDataTable(
  id: String,
  props: CfnDataTableProps,
  initializer: @AwsCdkDsl CfnDataTable.() -> Unit = {},
): CfnDataTable = CfnDataTable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataTable(id: String, initializer: @AwsCdkDsl CfnDataTable.Builder.() -> Unit = {}): CfnDataTable = CfnDataTable.Builder.create(this, id).apply(initializer).build()
