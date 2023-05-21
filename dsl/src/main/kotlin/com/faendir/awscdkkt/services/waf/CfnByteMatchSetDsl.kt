package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnByteMatchSet
import software.amazon.awscdk.services.waf.CfnByteMatchSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnByteMatchSet(
  id: String,
  props: CfnByteMatchSetProps,
  initializer: CfnByteMatchSet.() -> Unit = {},
): CfnByteMatchSet = CfnByteMatchSet(this, id, props).apply(initializer)
