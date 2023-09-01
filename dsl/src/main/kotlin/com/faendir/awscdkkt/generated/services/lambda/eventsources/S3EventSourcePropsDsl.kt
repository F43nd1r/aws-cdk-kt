package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps

@Generated
public fun buildS3EventSourceProps(initializer: @AwsCdkDsl S3EventSourceProps.Builder.() -> Unit =
    {}): S3EventSourceProps = S3EventSourceProps.Builder().apply(initializer).build()
