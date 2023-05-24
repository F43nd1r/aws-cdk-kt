package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.GraphWidget

@Generated
public fun buildGraphWidget(initializer: @AwsCdkDsl GraphWidget.Builder.() -> Unit): GraphWidget =
    GraphWidget.Builder.create().apply(initializer).build()
