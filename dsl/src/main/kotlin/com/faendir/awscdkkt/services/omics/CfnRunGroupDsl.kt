@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnRunGroup
import software.amazon.awscdk.services.omics.CfnRunGroupProps
import software.constructs.Construct

public fun Construct.cfnRunGroup(id: String, initializer: CfnRunGroup.() -> Unit = {}): CfnRunGroup
    = CfnRunGroup(this, id).apply(initializer)

public fun Construct.cfnRunGroup(
  id: String,
  props: CfnRunGroupProps,
  initializer: CfnRunGroup.() -> Unit = {},
): CfnRunGroup = CfnRunGroup(this, id, props).apply(initializer)
