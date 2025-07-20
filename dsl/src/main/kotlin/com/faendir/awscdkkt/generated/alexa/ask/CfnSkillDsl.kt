package com.faendir.awscdkkt.generated.alexa.ask

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.alexa.ask.CfnSkill
import software.amazon.awscdk.alexa.ask.CfnSkillProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSkill(
  id: String,
  props: CfnSkillProps,
  initializer: @AwsCdkDsl CfnSkill.() -> Unit = {},
): CfnSkill = CfnSkill(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSkill(id: String, initializer: @AwsCdkDsl CfnSkill.Builder.() -> Unit = {}): CfnSkill = CfnSkill.Builder.create(this, id).apply(initializer).build()
