package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.DataProtectionPolicyConfig

@Generated
public fun dataProtectionPolicyConfig(initializer: DataProtectionPolicyConfig.Builder.() -> Unit =
    {}): DataProtectionPolicyConfig =
    DataProtectionPolicyConfig.builder().apply(initializer).build()
