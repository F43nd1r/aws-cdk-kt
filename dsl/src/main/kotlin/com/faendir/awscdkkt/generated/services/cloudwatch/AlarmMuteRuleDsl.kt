package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.AlarmMuteRule
import software.amazon.awscdk.services.cloudwatch.AlarmMuteRuleProps
import software.constructs.Construct

@Generated
public fun Construct.alarmMuteRule(
  id: String,
  props: AlarmMuteRuleProps,
  initializer: @AwsCdkDsl AlarmMuteRule.() -> Unit = {},
): AlarmMuteRule = AlarmMuteRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAlarmMuteRule(id: String, initializer: @AwsCdkDsl AlarmMuteRule.Builder.() -> Unit = {}): AlarmMuteRule = AlarmMuteRule.Builder.create(this, id).apply(initializer).build()
