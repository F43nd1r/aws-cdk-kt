package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.S3JsonItemReader

@Generated
public fun buildS3JsonItemReader(initializer: @AwsCdkDsl S3JsonItemReader.Builder.() -> Unit = {}):
    S3JsonItemReader = S3JsonItemReader.Builder.create().apply(initializer).build()
