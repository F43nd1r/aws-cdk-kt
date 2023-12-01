package com.faendir.awscdkkt.generated.services.cleanrooms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTable
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfiguredTable(
  id: String,
  props: CfnConfiguredTableProps,
  initializer: @AwsCdkDsl CfnConfiguredTable.() -> Unit = {},
): CfnConfiguredTable = CfnConfiguredTable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfiguredTable(id: String, initializer: @AwsCdkDsl
    CfnConfiguredTable.Builder.() -> Unit = {}): CfnConfiguredTable =
    CfnConfiguredTable.Builder.create(this, id).apply(initializer).build()
