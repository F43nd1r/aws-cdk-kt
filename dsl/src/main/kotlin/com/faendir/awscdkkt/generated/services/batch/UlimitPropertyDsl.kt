package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun buildUlimitProperty(initializer: @AwsCdkDsl
    CfnJobDefinition.UlimitProperty.Builder.() -> Unit): CfnJobDefinition.UlimitProperty =
    CfnJobDefinition.UlimitProperty.Builder().apply(initializer).build()
