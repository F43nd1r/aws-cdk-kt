@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource
import software.amazon.awscdk.services.kendra.CfnDataSourceProps
import software.constructs.Construct

public fun Construct.cfnDataSource(
  id: String,
  props: CfnDataSourceProps,
  initializer: CfnDataSource.() -> Unit = {},
): CfnDataSource = CfnDataSource(this, id, props).apply(initializer)
