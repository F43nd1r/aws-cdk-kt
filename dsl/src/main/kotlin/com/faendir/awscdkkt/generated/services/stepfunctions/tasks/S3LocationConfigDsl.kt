package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationConfig

@Generated
public fun buildS3LocationConfig(initializer: @AwsCdkDsl S3LocationConfig.Builder.() -> Unit):
    S3LocationConfig = S3LocationConfig.Builder().apply(initializer).build()
