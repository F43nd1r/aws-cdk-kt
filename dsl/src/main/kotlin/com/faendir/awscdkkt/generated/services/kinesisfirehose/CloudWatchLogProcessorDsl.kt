package com.faendir.awscdkkt.generated.services.kinesisfirehose

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisfirehose.CloudWatchLogProcessor

@Generated
public fun buildCloudWatchLogProcessor(initializer: @AwsCdkDsl CloudWatchLogProcessor.Builder.() -> Unit = {}): CloudWatchLogProcessor = CloudWatchLogProcessor.Builder.create().apply(initializer).build()
