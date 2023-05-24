package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@Generated
public fun buildSecretProperty(initializer: @AwsCdkDsl
    CfnTaskDefinition.SecretProperty.Builder.() -> Unit): CfnTaskDefinition.SecretProperty =
    CfnTaskDefinition.SecretProperty.Builder().apply(initializer).build()
