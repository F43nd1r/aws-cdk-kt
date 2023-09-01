package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun buildEksSecretProperty(initializer: @AwsCdkDsl
    CfnJobDefinition.EksSecretProperty.Builder.() -> Unit = {}): CfnJobDefinition.EksSecretProperty
    = CfnJobDefinition.EksSecretProperty.Builder().apply(initializer).build()
