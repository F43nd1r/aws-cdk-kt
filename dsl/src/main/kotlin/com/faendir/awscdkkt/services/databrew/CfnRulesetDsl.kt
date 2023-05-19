@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
