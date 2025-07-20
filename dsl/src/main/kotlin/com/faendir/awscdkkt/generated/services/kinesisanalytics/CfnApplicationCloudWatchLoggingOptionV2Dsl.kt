package com.faendir.awscdkkt.generated.services.kinesisanalytics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationCloudWatchLoggingOptionV2(
  id: String,
  props: CfnApplicationCloudWatchLoggingOptionV2Props,
  initializer: @AwsCdkDsl CfnApplicationCloudWatchLoggingOptionV2.() -> Unit = {},
): CfnApplicationCloudWatchLoggingOptionV2 = CfnApplicationCloudWatchLoggingOptionV2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationCloudWatchLoggingOptionV2(id: String, initializer: @AwsCdkDsl CfnApplicationCloudWatchLoggingOptionV2.Builder.() -> Unit = {}): CfnApplicationCloudWatchLoggingOptionV2 = CfnApplicationCloudWatchLoggingOptionV2.Builder.create(this, id).apply(initializer).build()
