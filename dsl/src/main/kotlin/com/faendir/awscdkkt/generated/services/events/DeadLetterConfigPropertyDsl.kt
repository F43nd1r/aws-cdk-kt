package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule

@Generated
public fun buildDeadLetterConfigProperty(initializer: @AwsCdkDsl
    CfnRule.DeadLetterConfigProperty.Builder.() -> Unit): CfnRule.DeadLetterConfigProperty =
    CfnRule.DeadLetterConfigProperty.Builder().apply(initializer).build()
