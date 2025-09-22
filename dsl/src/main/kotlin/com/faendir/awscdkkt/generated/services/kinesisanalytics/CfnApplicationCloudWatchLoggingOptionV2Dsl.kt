@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.kinesisanalytics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props
import software.constructs.Construct

@Deprecated(message = "software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2 is deprecated in CDK.")
@Generated
public fun Construct.cfnApplicationCloudWatchLoggingOptionV2(
  id: String,
  props: CfnApplicationCloudWatchLoggingOptionV2Props,
  initializer: @AwsCdkDsl CfnApplicationCloudWatchLoggingOptionV2.() -> Unit = {},
): CfnApplicationCloudWatchLoggingOptionV2 = CfnApplicationCloudWatchLoggingOptionV2(this, id, props).apply(initializer)

@Deprecated(message = "software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2 is deprecated in CDK.")
@Generated
public fun Construct.buildCfnApplicationCloudWatchLoggingOptionV2(id: String, initializer: @AwsCdkDsl CfnApplicationCloudWatchLoggingOptionV2.Builder.() -> Unit = {}): CfnApplicationCloudWatchLoggingOptionV2 = CfnApplicationCloudWatchLoggingOptionV2.Builder.create(this, id).apply(initializer).build()
