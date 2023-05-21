package com.faendir.awscdkkt.services.memorydb

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnACL
import software.amazon.awscdk.services.memorydb.CfnACLProps
import software.constructs.Construct

@Generated
public fun Construct.cfnACL(
  id: String,
  props: CfnACLProps,
  initializer: CfnACL.() -> Unit = {},
): CfnACL = CfnACL(this, id, props).apply(initializer)
