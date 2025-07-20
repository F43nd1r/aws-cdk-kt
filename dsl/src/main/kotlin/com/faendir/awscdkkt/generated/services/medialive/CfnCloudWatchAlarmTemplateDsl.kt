package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplate
import software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCloudWatchAlarmTemplate(
  id: String,
  props: CfnCloudWatchAlarmTemplateProps,
  initializer: @AwsCdkDsl CfnCloudWatchAlarmTemplate.() -> Unit = {},
): CfnCloudWatchAlarmTemplate = CfnCloudWatchAlarmTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCloudWatchAlarmTemplate(id: String, initializer: @AwsCdkDsl CfnCloudWatchAlarmTemplate.Builder.() -> Unit = {}): CfnCloudWatchAlarmTemplate = CfnCloudWatchAlarmTemplate.Builder.create(this, id).apply(initializer).build()
