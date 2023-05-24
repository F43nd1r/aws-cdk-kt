package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CustomWidget

@Generated
public fun buildCustomWidget(initializer: @AwsCdkDsl CustomWidget.Builder.() -> Unit): CustomWidget
    = CustomWidget.Builder.create().apply(initializer).build()
