package com.faendir.awscdkkt.generated.services.timestream

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.timestream.CfnTable
import software.amazon.awscdk.services.timestream.CfnTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTable(
  id: String,
  props: CfnTableProps,
  initializer: @AwsCdkDsl CfnTable.() -> Unit = {},
): CfnTable = CfnTable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTable(id: String, initializer: @AwsCdkDsl CfnTable.Builder.() -> Unit = {}): CfnTable = CfnTable.Builder.create(this, id).apply(initializer).build()
