package com.faendir.awscdkkt.generated.services.cleanrooms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanrooms.CfnIntermediateTable
import software.amazon.awscdk.services.cleanrooms.CfnIntermediateTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIntermediateTable(
  id: String,
  props: CfnIntermediateTableProps,
  initializer: @AwsCdkDsl CfnIntermediateTable.() -> Unit = {},
): CfnIntermediateTable = CfnIntermediateTable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIntermediateTable(id: String, initializer: @AwsCdkDsl CfnIntermediateTable.Builder.() -> Unit = {}): CfnIntermediateTable = CfnIntermediateTable.Builder.create(this, id).apply(initializer).build()
