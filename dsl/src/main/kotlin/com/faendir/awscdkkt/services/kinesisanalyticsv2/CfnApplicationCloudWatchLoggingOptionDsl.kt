@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOptionProps
import software.constructs.Construct

public fun Construct.cfnApplicationCloudWatchLoggingOption(
  id: String,
  props: CfnApplicationCloudWatchLoggingOptionProps,
  initializer: CfnApplicationCloudWatchLoggingOption.() -> Unit = {},
): CfnApplicationCloudWatchLoggingOption = CfnApplicationCloudWatchLoggingOption(this, id,
    props).apply(initializer)
