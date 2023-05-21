package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSet
import software.amazon.awscdk.services.wafv2.CfnRegexPatternSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRegexPatternSet(
  id: String,
  props: CfnRegexPatternSetProps,
  initializer: CfnRegexPatternSet.() -> Unit = {},
): CfnRegexPatternSet = CfnRegexPatternSet(this, id, props).apply(initializer)
