package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDataQualityRuleset
import software.amazon.awscdk.services.glue.CfnDataQualityRulesetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataQualityRuleset(id: String, initializer: @AwsCdkDsl CfnDataQualityRuleset.() -> Unit = {}): CfnDataQualityRuleset = CfnDataQualityRuleset(this, id).apply(initializer)

@Generated
public fun Construct.cfnDataQualityRuleset(
  id: String,
  props: CfnDataQualityRulesetProps,
  initializer: @AwsCdkDsl CfnDataQualityRuleset.() -> Unit = {},
): CfnDataQualityRuleset = CfnDataQualityRuleset(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataQualityRuleset(id: String, initializer: @AwsCdkDsl CfnDataQualityRuleset.Builder.() -> Unit = {}): CfnDataQualityRuleset = CfnDataQualityRuleset.Builder.create(this, id).apply(initializer).build()
