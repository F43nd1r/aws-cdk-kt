package com.faendir.awscdkkt.generated.services.shield

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.shield.CfnProtection

@Generated
public fun buildActionProperty(initializer: @AwsCdkDsl
    CfnProtection.ActionProperty.Builder.() -> Unit = {}): CfnProtection.ActionProperty =
    CfnProtection.ActionProperty.Builder().apply(initializer).build()
