package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateGroup
import software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCloudWatchAlarmTemplateGroup(
  id: String,
  props: CfnCloudWatchAlarmTemplateGroupProps,
  initializer: @AwsCdkDsl CfnCloudWatchAlarmTemplateGroup.() -> Unit = {},
): CfnCloudWatchAlarmTemplateGroup = CfnCloudWatchAlarmTemplateGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCloudWatchAlarmTemplateGroup(id: String, initializer: @AwsCdkDsl CfnCloudWatchAlarmTemplateGroup.Builder.() -> Unit = {}): CfnCloudWatchAlarmTemplateGroup = CfnCloudWatchAlarmTemplateGroup.Builder.create(this, id).apply(initializer).build()
