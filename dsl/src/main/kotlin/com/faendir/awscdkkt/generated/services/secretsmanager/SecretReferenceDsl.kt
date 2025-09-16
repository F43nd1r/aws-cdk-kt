package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretReference

@Generated
public fun buildSecretReference(initializer: @AwsCdkDsl SecretReference.Builder.() -> Unit = {}): SecretReference = SecretReference.Builder().apply(initializer).build()
