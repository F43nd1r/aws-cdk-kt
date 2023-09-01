package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.NotificationKeyFilter

@Generated
public fun buildNotificationKeyFilter(initializer: @AwsCdkDsl
    NotificationKeyFilter.Builder.() -> Unit = {}): NotificationKeyFilter =
    NotificationKeyFilter.Builder().apply(initializer).build()
