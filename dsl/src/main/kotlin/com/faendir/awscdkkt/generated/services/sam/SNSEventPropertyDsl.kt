package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun buildSNSEventProperty(initializer: @AwsCdkDsl
    CfnFunction.SNSEventProperty.Builder.() -> Unit = {}): CfnFunction.SNSEventProperty =
    CfnFunction.SNSEventProperty.Builder().apply(initializer).build()
