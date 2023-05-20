@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.resourceexplorer2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.resourceexplorer2.CfnIndex
import software.amazon.awscdk.services.resourceexplorer2.CfnIndexProps
import software.constructs.Construct

public fun Construct.cfnIndex(
  id: String,
  props: CfnIndexProps,
  initializer: CfnIndex.() -> Unit = {},
): CfnIndex = CfnIndex(this, id, props).apply(initializer)
