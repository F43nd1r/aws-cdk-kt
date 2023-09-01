package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnSecret

@Generated
public fun buildGenerateSecretStringProperty(initializer: @AwsCdkDsl
    CfnSecret.GenerateSecretStringProperty.Builder.() -> Unit = {}):
    CfnSecret.GenerateSecretStringProperty =
    CfnSecret.GenerateSecretStringProperty.Builder().apply(initializer).build()
