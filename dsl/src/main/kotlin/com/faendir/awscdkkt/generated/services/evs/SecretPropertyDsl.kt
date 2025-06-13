package com.faendir.awscdkkt.generated.services.evs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.evs.CfnEnvironment

@Generated
public fun buildSecretProperty(initializer: @AwsCdkDsl
    CfnEnvironment.SecretProperty.Builder.() -> Unit = {}): CfnEnvironment.SecretProperty =
    CfnEnvironment.SecretProperty.Builder().apply(initializer).build()
