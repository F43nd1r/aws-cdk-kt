@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
