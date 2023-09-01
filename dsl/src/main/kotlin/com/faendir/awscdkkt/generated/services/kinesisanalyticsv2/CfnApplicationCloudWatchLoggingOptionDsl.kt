package com.faendir.awscdkkt.generated.services.kinesisanalyticsv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationCloudWatchLoggingOption(
  id: String,
  props: CfnApplicationCloudWatchLoggingOptionProps,
  initializer: @AwsCdkDsl CfnApplicationCloudWatchLoggingOption.() -> Unit = {},
): CfnApplicationCloudWatchLoggingOption = CfnApplicationCloudWatchLoggingOption(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationCloudWatchLoggingOption(id: String, initializer: @AwsCdkDsl
    CfnApplicationCloudWatchLoggingOption.Builder.() -> Unit = {}):
    CfnApplicationCloudWatchLoggingOption =
    CfnApplicationCloudWatchLoggingOption.Builder.create(this, id).apply(initializer).build()
