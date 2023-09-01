package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions

@Generated
public fun buildAttachedSecretOptions(initializer: @AwsCdkDsl
    AttachedSecretOptions.Builder.() -> Unit = {}): AttachedSecretOptions =
    AttachedSecretOptions.Builder().apply(initializer).build()
