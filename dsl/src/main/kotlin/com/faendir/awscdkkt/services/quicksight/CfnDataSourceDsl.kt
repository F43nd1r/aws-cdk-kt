@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDataSource
import software.amazon.awscdk.services.quicksight.CfnDataSourceProps
import software.constructs.Construct

public fun Construct.cfnDataSource(id: String, initializer: CfnDataSource.() -> Unit = {}):
    CfnDataSource = CfnDataSource(this, id).apply(initializer)

public fun Construct.cfnDataSource(
  id: String,
  props: CfnDataSourceProps,
  initializer: CfnDataSource.() -> Unit = {},
): CfnDataSource = CfnDataSource(this, id, props).apply(initializer)
