package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnPrompt

@Generated
public fun buildMessageProperty(initializer: @AwsCdkDsl CfnPrompt.MessageProperty.Builder.() -> Unit
    = {}): CfnPrompt.MessageProperty =
    CfnPrompt.MessageProperty.Builder().apply(initializer).build()
