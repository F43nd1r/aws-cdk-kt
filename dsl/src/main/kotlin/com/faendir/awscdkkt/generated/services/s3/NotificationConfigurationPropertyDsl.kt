package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun buildNotificationConfigurationProperty(initializer: @AwsCdkDsl
    CfnBucket.NotificationConfigurationProperty.Builder.() -> Unit):
    CfnBucket.NotificationConfigurationProperty =
    CfnBucket.NotificationConfigurationProperty.Builder().apply(initializer).build()
