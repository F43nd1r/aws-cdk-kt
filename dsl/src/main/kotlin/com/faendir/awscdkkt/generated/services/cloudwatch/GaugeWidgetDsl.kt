package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.GaugeWidget
import software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps

@Generated
public fun gaugeWidget(props: GaugeWidgetProps): GaugeWidget = GaugeWidget(props)

@Generated
public fun buildGaugeWidget(initializer: @AwsCdkDsl GaugeWidget.Builder.() -> Unit): GaugeWidget =
    GaugeWidget.Builder.create().apply(initializer).build()
