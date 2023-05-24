package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.TextWidget
import software.amazon.awscdk.services.cloudwatch.TextWidgetProps

@Generated
public fun textWidget(props: TextWidgetProps): TextWidget = TextWidget(props)

@Generated
public fun buildTextWidget(initializer: @AwsCdkDsl TextWidget.Builder.() -> Unit): TextWidget =
    TextWidget.Builder.create().apply(initializer).build()
