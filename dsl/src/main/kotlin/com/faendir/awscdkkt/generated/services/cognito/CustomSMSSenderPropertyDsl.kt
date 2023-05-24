package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun buildCustomSMSSenderProperty(initializer: @AwsCdkDsl
    CfnUserPool.CustomSMSSenderProperty.Builder.() -> Unit): CfnUserPool.CustomSMSSenderProperty =
    CfnUserPool.CustomSMSSenderProperty.Builder().apply(initializer).build()
