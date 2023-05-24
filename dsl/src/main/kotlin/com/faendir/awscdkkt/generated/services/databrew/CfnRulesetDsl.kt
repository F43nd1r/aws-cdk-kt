package com.faendir.awscdkkt.generated.services.databrew

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnRuleset
import software.amazon.awscdk.services.databrew.CfnRulesetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRuleset(id: String, props: CfnRulesetProps): CfnRuleset = CfnRuleset(this,
    id, props)

@Generated
public fun Construct.cfnRuleset(
  id: String,
  props: CfnRulesetProps,
  initializer: @AwsCdkDsl CfnRuleset.() -> Unit,
): CfnRuleset = CfnRuleset(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRuleset(id: String, initializer: @AwsCdkDsl
    CfnRuleset.Builder.() -> Unit): CfnRuleset = CfnRuleset.Builder.create(this,
    id).apply(initializer).build()
