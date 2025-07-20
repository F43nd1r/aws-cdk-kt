package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnMailManagerRuleSet
import software.amazon.awscdk.services.ses.CfnMailManagerRuleSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMailManagerRuleSet(
  id: String,
  props: CfnMailManagerRuleSetProps,
  initializer: @AwsCdkDsl CfnMailManagerRuleSet.() -> Unit = {},
): CfnMailManagerRuleSet = CfnMailManagerRuleSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMailManagerRuleSet(id: String, initializer: @AwsCdkDsl CfnMailManagerRuleSet.Builder.() -> Unit = {}): CfnMailManagerRuleSet = CfnMailManagerRuleSet.Builder.create(this, id).apply(initializer).build()
