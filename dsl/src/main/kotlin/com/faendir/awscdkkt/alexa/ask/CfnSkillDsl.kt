@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.alexa.ask

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.alexa.ask.CfnSkill
import software.amazon.awscdk.alexa.ask.CfnSkillProps
import software.constructs.Construct

public fun Construct.cfnSkill(
  id: String,
  props: CfnSkillProps,
  initializer: CfnSkill.() -> Unit = {},
): CfnSkill = CfnSkill(this, id, props).apply(initializer)
