package com.faendir.awscdkkt.generated.services.pipes

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public fun buildS3LogDestinationProperty(initializer: @AwsCdkDsl
    CfnPipe.S3LogDestinationProperty.Builder.() -> Unit = {}): CfnPipe.S3LogDestinationProperty =
    CfnPipe.S3LogDestinationProperty.Builder().apply(initializer).build()
