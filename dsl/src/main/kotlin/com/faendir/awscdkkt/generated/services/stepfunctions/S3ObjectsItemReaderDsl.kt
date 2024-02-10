package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader

@Generated
public fun buildS3ObjectsItemReader(initializer: @AwsCdkDsl S3ObjectsItemReader.Builder.() -> Unit =
    {}): S3ObjectsItemReader = S3ObjectsItemReader.Builder.create().apply(initializer).build()
