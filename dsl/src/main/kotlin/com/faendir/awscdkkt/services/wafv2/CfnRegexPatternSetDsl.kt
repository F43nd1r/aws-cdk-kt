@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSet
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps
import software.constructs.Construct

public fun Construct.cfnRegexPatternSet(
  id: String,
  props: CfnRegexPatternSetProps,
  initializer: CfnRegexPatternSet.() -> Unit = {},
): CfnRegexPatternSet = CfnRegexPatternSet(this, id, props).apply(initializer)
