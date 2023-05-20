@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.waf.regional

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnByteMatchSet
import software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps
import software.constructs.Construct

public fun Construct.cfnByteMatchSet(
  id: String,
  props: CfnByteMatchSetProps,
  initializer: CfnByteMatchSet.() -> Unit = {},
): CfnByteMatchSet = CfnByteMatchSet(this, id, props).apply(initializer)
