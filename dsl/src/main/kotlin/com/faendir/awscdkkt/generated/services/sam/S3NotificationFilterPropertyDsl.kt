package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun buildS3NotificationFilterProperty(initializer: @AwsCdkDsl
    CfnFunction.S3NotificationFilterProperty.Builder.() -> Unit = {}):
    CfnFunction.S3NotificationFilterProperty =
    CfnFunction.S3NotificationFilterProperty.Builder().apply(initializer).build()
