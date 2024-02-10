package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.S3ManifestItemReader

@Generated
public fun buildS3ManifestItemReader(initializer: @AwsCdkDsl S3ManifestItemReader.Builder.() -> Unit
    = {}): S3ManifestItemReader = S3ManifestItemReader.Builder.create().apply(initializer).build()
