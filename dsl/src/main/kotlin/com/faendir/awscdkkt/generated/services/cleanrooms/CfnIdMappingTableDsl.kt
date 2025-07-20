package com.faendir.awscdkkt.generated.services.cleanrooms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanrooms.CfnIdMappingTable
import software.amazon.awscdk.services.cleanrooms.CfnIdMappingTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdMappingTable(
  id: String,
  props: CfnIdMappingTableProps,
  initializer: @AwsCdkDsl CfnIdMappingTable.() -> Unit = {},
): CfnIdMappingTable = CfnIdMappingTable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdMappingTable(id: String, initializer: @AwsCdkDsl CfnIdMappingTable.Builder.() -> Unit = {}): CfnIdMappingTable = CfnIdMappingTable.Builder.create(this, id).apply(initializer).build()
