@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnXssMatchSet
import software.amazon.awscdk.services.waf.CfnXssMatchSetProps
import software.constructs.Construct

public fun Construct.cfnXssMatchSet(
  id: String,
  props: CfnXssMatchSetProps,
  initializer: CfnXssMatchSet.() -> Unit = {},
): CfnXssMatchSet = CfnXssMatchSet(this, id, props).apply(initializer)
