package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun buildS3EventProperty(initializer: @AwsCdkDsl
    CfnFunction.S3EventProperty.Builder.() -> Unit = {}): CfnFunction.S3EventProperty =
    CfnFunction.S3EventProperty.Builder().apply(initializer).build()
