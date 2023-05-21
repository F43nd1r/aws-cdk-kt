package com.faendir.awscdkkt.cloudformation.include

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cloudformation.include.CfnInclude
import software.amazon.awscdk.cloudformation.include.CfnIncludeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInclude(
  id: String,
  props: CfnIncludeProps,
  initializer: CfnInclude.() -> Unit = {},
): CfnInclude = CfnInclude(this, id, props).apply(initializer)
