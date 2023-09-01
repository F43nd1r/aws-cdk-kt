package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.DashboardVariable

@Generated
public fun buildDashboardVariable(initializer: @AwsCdkDsl DashboardVariable.Builder.() -> Unit =
    {}): DashboardVariable = DashboardVariable.Builder.create().apply(initializer).build()
