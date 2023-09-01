package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun buildCustomEmailSenderProperty(initializer: @AwsCdkDsl
    CfnUserPool.CustomEmailSenderProperty.Builder.() -> Unit = {}):
    CfnUserPool.CustomEmailSenderProperty =
    CfnUserPool.CustomEmailSenderProperty.Builder().apply(initializer).build()
