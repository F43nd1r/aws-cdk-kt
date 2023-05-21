package com.faendir.awscdkkt.services.kinesisanalytics

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
  initializer: CfnApplicationCloudWatchLoggingOptionV2.() -> Unit = {},
): CfnApplicationCloudWatchLoggingOptionV2 = CfnApplicationCloudWatchLoggingOptionV2(this, id,
    props).apply(initializer)
