package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

@Generated
public fun buildDeadLetterConfigProperty(initializer: @AwsCdkDsl CfnFunction.DeadLetterConfigProperty.Builder.() -> Unit = {}): CfnFunction.DeadLetterConfigProperty = CfnFunction.DeadLetterConfigProperty.Builder().apply(initializer).build()
