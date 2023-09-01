package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.LogQueryWidget

@Generated
public fun buildLogQueryWidget(initializer: @AwsCdkDsl LogQueryWidget.Builder.() -> Unit = {}):
    LogQueryWidget = LogQueryWidget.Builder.create().apply(initializer).build()
