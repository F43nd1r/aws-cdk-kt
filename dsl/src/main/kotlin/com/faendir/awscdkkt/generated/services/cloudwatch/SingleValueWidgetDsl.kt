package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.SingleValueWidget
import software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps

@Generated
public fun singleValueWidget(props: SingleValueWidgetProps): SingleValueWidget =
    SingleValueWidget(props)

@Generated
public fun buildSingleValueWidget(initializer: @AwsCdkDsl SingleValueWidget.Builder.() -> Unit):
    SingleValueWidget = SingleValueWidget.Builder.create().apply(initializer).build()
