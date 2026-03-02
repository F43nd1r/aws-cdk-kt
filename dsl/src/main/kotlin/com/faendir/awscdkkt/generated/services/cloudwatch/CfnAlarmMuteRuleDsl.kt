package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAlarmMuteRule
import software.amazon.awscdk.services.cloudwatch.CfnAlarmMuteRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAlarmMuteRule(
  id: String,
  props: CfnAlarmMuteRuleProps,
  initializer: @AwsCdkDsl CfnAlarmMuteRule.() -> Unit = {},
): CfnAlarmMuteRule = CfnAlarmMuteRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAlarmMuteRule(id: String, initializer: @AwsCdkDsl CfnAlarmMuteRule.Builder.() -> Unit = {}): CfnAlarmMuteRule = CfnAlarmMuteRule.Builder.create(this, id).apply(initializer).build()
