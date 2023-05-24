package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions

@Generated
public fun buildCloudWatchLoggingOptions(initializer: @AwsCdkDsl
    CloudWatchLoggingOptions.Builder.() -> Unit): CloudWatchLoggingOptions =
    CloudWatchLoggingOptions.Builder().apply(initializer).build()
