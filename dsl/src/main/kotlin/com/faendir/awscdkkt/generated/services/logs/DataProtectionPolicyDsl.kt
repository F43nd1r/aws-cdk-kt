package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.DataProtectionPolicy

@Generated
public fun buildDataProtectionPolicy(initializer: @AwsCdkDsl
    DataProtectionPolicy.Builder.() -> Unit): DataProtectionPolicy =
    DataProtectionPolicy.Builder.create().apply(initializer).build()
