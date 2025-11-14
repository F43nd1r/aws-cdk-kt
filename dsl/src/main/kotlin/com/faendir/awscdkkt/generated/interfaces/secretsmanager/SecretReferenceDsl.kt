package com.faendir.awscdkkt.generated.interfaces.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.secretsmanager.SecretReference

@Generated
public fun buildSecretReference(initializer: @AwsCdkDsl SecretReference.Builder.() -> Unit = {}): SecretReference = SecretReference.Builder().apply(initializer).build()
