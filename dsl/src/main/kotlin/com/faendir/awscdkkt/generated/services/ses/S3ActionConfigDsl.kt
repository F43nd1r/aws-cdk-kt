package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.S3ActionConfig

@Generated
public fun buildS3ActionConfig(initializer: @AwsCdkDsl S3ActionConfig.Builder.() -> Unit):
    S3ActionConfig = S3ActionConfig.Builder().apply(initializer).build()
