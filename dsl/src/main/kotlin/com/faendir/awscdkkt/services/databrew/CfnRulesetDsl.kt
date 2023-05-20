@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnRuleset
import software.amazon.awscdk.services.databrew.CfnRulesetProps
import software.constructs.Construct

public fun Construct.cfnRuleset(
  id: String,
  props: CfnRulesetProps,
  initializer: CfnRuleset.() -> Unit = {},
): CfnRuleset = CfnRuleset(this, id, props).apply(initializer)
