package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource
import software.amazon.awscdk.services.quicksight.CfnDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataSource(id: String, initializer: CfnDataSource.() -> Unit = {}):
    CfnDataSource = CfnDataSource(this, id).apply(initializer)

@Generated
public fun Construct.cfnDataSource(
  id: String,
  props: CfnDataSourceProps,
  initializer: CfnDataSource.() -> Unit = {},
): CfnDataSource = CfnDataSource(this, id, props).apply(initializer)
