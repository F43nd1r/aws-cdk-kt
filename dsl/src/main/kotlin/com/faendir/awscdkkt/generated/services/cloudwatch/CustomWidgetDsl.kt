package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CustomWidget
import software.amazon.awscdk.services.cloudwatch.CustomWidgetProps

@Generated
public fun customWidget(props: CustomWidgetProps): CustomWidget = CustomWidget(props)

@Generated
public fun buildCustomWidget(initializer: @AwsCdkDsl CustomWidget.Builder.() -> Unit): CustomWidget
    = CustomWidget.Builder.create().apply(initializer).build()
