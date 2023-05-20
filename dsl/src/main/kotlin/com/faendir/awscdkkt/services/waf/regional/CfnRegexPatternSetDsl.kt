@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.waf.regional

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSet
import software.amazon.awscdk.services.waf.regional.CfnRegexPatternSetProps
import software.constructs.Construct

public fun Construct.cfnRegexPatternSet(
  id: String,
  props: CfnRegexPatternSetProps,
  initializer: CfnRegexPatternSet.() -> Unit = {},
): CfnRegexPatternSet = CfnRegexPatternSet(this, id, props).apply(initializer)
