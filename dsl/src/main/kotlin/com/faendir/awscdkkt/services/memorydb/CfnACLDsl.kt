@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.memorydb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnACL
import software.amazon.awscdk.services.memorydb.CfnACLProps
import software.constructs.Construct

public fun Construct.cfnACL(
  id: String,
  props: CfnACLProps,
  initializer: CfnACL.() -> Unit = {},
): CfnACL = CfnACL(this, id, props).apply(initializer)
