package com.faendir.awscdkkt.generated.services.securitylake

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.securitylake.CfnSubscriber

@Generated
public fun buildCustomLogSourceProperty(initializer: @AwsCdkDsl
    CfnSubscriber.CustomLogSourceProperty.Builder.() -> Unit = {}):
    CfnSubscriber.CustomLogSourceProperty =
    CfnSubscriber.CustomLogSourceProperty.Builder().apply(initializer).build()
