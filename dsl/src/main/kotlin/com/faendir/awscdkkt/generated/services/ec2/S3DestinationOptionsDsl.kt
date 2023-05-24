package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.S3DestinationOptions

@Generated
public fun buildS3DestinationOptions(initializer: @AwsCdkDsl
    S3DestinationOptions.Builder.() -> Unit): S3DestinationOptions =
    S3DestinationOptions.Builder().apply(initializer).build()
