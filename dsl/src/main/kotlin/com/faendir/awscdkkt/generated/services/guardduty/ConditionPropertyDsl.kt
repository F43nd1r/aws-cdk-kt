package com.faendir.awscdkkt.generated.services.guardduty

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnFilter

@Generated
public fun buildConditionProperty(initializer: @AwsCdkDsl
    CfnFilter.ConditionProperty.Builder.() -> Unit = {}): CfnFilter.ConditionProperty =
    CfnFilter.ConditionProperty.Builder().apply(initializer).build()
